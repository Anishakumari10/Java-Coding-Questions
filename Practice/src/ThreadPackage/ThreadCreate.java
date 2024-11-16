package ThreadPackage;

//public class ThreadCreate implements Runnable {
//

public class ThreadCreate extends Thread {

	@Override
	public void run() {

		System.out.println("New Thread");

	}

	public static void main(String[] args) {

//		ThreadCreate t = new ThreadCreate();
//		Thread t1 = new Thread(t);
//		t1.start();
//
		ThreadCreate t = new ThreadCreate();
		t.start();
		var a = 10;
		System.out.println(a);

	}
}
