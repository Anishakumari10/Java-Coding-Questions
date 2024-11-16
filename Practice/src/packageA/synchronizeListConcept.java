package packageA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class synchronizeListConcept {

	public static void main(String[] args) throws InterruptedException {

		List<Integer> syncList = Collections.synchronizedList(new ArrayList<>());

		Runnable listOperations = () -> {
			syncList.addAll(List.of(1, 2, 3, 4, 5, 6));
		};
		Runnable listOperations2 = () -> {
			syncList.addAll(List.of(5, 9, 0, 1, 4));
		};
		
		

		Thread thread1 = new Thread(listOperations);
		Thread thread2 = new Thread(listOperations2);

		thread1.start();
		thread2.start();

		thread1.join();
		System.out.println("Thread 1 finished" + thread1.getName());
		thread2.join();
		System.out.println("Thread 2 finished" + thread2.getName());

		System.out.println("Size of synchronized list: " + syncList.size());
	}
}
