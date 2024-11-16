package packageA;

public class OddEvenExample {

    private static final Object lock = new Object();
    private static int count = 1;
    private static final int MAX = 10;

    public static void main(String[] args) throws InterruptedException {

		Thread oddThread = new Thread(() -> {
			try {
				printOdd();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}, "Odd-Thread");
        Thread evenThread = new Thread(() -> {
			try { 
				printEven();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}, "Even-Thread");
        oddThread.start();
        evenThread.start();
        oddThread.join(); // Wait for oddThread to finish
        evenThread.join(); // Wait for evenThread to finish
    }

    private static void printOdd() throws InterruptedException {
        while (count < MAX) {
            synchronized (lock) {
                if (count % 2 != 0) {
                    System.out.println(Thread.currentThread().getName() + " - " + count);
                    count++;
                    Thread.sleep(2000);
                    lock.notify(); // Notify the other thread
                } else {
                    try {
                        lock.wait(); // Wait for the other thread's turn
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }

    private static void printEven() throws InterruptedException {
        while (count <= MAX) {
            synchronized (lock) {
                if (count % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + " - " + count);
                    count++;
                    Thread.sleep(1000);
                    lock.notify(); // Notify the other thread
                } else {
                    try {
                        lock.wait(); // Wait for the other thread's turn
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        }
    }
}
