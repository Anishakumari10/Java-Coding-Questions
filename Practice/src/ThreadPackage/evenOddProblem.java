package ThreadPackage;
import java.io.*;
import java.lang.*;

public class evenOddProblem implements Runnable {

	public static void main(String[] args) {

		Thread obj = new Thread(new evenOddProblem());
		Thread obj1 = new Thread(new evenOddProblem());
	
		obj.start();
		obj1.start();

	}

	static int count = 1;

	@Override
	public void run() {

		while (count <= 10) {
			if (count % 2 == 0) {
				System.out.println("Even" + count);
				count++;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println("Odd" + count);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				count++;
			}
		}
	}

}
