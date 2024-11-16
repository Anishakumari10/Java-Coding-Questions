package ThreadPackage;

public class ThreadWaitNotify {
	
	int count = 0;

	public void countIncrement() {
		count++;
	}

	public void set(int count) {
		System.out.println("SET:" + count);
		this.count = count;
	}

	public int get() {
		System.out.println("GET:" + count);
		return count;

	}

	class Producer {

		public Producer(ThreadWaitNotify tw) {
			// TODO Auto-generated constructor stub
		}

		ThreadWaitNotify twn;
		
		Thread t = new Thread((Runnable) this,"Producer");
		
		Runnable runnable = () -> {

			while (true) {
				twn.set(count);
				t.start();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
	}	

	class Consumer {

		ThreadWaitNotify twn;
		
		Thread t = new Thread((Runnable) this,"Consumer");
		
		Runnable runnable = () -> {

			while (true) {
				twn.get();
				t.start();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
	}	


	public static void main(String[] args) {
		
		ThreadWaitNotify tw = new ThreadWaitNotify();
		new Producer(tw);
		new Consumer(tw);
		
	}

}