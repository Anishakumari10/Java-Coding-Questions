package packageA;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVSLinkedList {

	public static void main(String[] args) {
		long end, start;
		List<String> al = new ArrayList<>();
		start = System.currentTimeMillis();
		System.out.println(start);
		al.add("Orange"); 
		al.add("Apple");
		al.add("Banana");
		end = System.currentTimeMillis();
		System.out.println(end);
		System.out.println("Total time taken: " + (end - start));
		System.out.println("Adding in ArrayList");
		
		for (String list : al) {
			System.out.println(list);
		}

		end = 0;
		start = 0;
		List<String> al1 = new LinkedList<String>();
		start = System.currentTimeMillis();
		System.out.println(start);
		al1.add("Fruits");
		al1.add("Veggies");
		al1.add("Grocery");
		end = System.currentTimeMillis();
		System.out.println(end);

		System.out.println("Adding in LinkedList");
		for (String list1 : al1) {
			System.out.println(list1);
		}

		System.out.println("Finished adding in LinkedList");
		System.out.println("Total time taken: " + (end - start));

	}

}
