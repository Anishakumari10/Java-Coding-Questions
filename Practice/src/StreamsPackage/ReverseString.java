package StreamsPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import packageA.Employee;

public class ReverseString {

	public static void main(String[] args) {

		List<Integer> al = List.of(2, 3, 7, 1, 8); // 1,2,3,7,8

		// Reverse a name
		/*
		 * al.stream() .map(name -> new StringBuilder(name) .reverse().toString())
		 * .forEach(name -> System.out.println(name));
		 */

		// count the vowels in the string

		/*
		 * String name= "anisha";
		 * 
		 * long count = name.chars().filter((x) -> { return (x == 'a')||(x == 'e')||(x
		 * == 'i')||(x == 'o')||(x == 'u'); }).count();
		 * 
		 * System.out.println(count);
		 */

		// FINDING DUPLICATES

		
		 String name = "anisha";
			
			 Map<String,Long> out= name.chars().mapToObj(x -> (char)x).collect(Collectors.groupingBy(Object::toString,
			 Collectors.counting()));
			 
			 System.out.println(out);
			 //out.forEach((key,value) -> System.out.println(key +"->"+ value));
			 
		 

		// Sort a List of Strings Alphabetically:

		/*
		 * List<String> newList = al.stream().sorted().collect(Collectors.toList());
		 * 
		 * for(String s : newList) { System.out.println(s); }
		 */

		// Find Second Smallest and Largest Elements in a List
		/*
		 * int secondSmallest = al.stream().sorted().skip(1) .findFirst() .orElse(null);
		 * 
		 * System.out.println("secondSmallest"+ secondSmallest);
		 * 
		 * int secondLargestNum =
		 * al.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(null
		 * );
		 * 
		 * System.out.println("secondLargestNum"+ secondLargestNum);
		 */
		// 1. Given a sentence, find and print the frequency of each word.
		String sentence = "Java is a programming language. Java is versatile.";

		String a = "Ani8@90kumar";
		
		// a.chars().mapToObj(x -> (char)x).filter(Character::isLetter).forEach(x ->
				// System.out.println(x));

		// 3. Given a list of names, group them by their first letter, and then count
		// the number of names in each group.

		String[] names = { "Alice", "Bob", "Charlie", "Amy", "Bill", "Anna" };
		
		Map<Character, Long> mp =Arrays.stream(names).collect(Collectors.groupingBy(x -> x.charAt(0), Collectors.counting()));
		
		//System.out.println(mp);

		

		/*
		 * Map<Object, Long> charFreqMap = sentence.chars().mapToObj(x ->
		 * (char)x).filter(Character::isLetter)
		 * .collect(Collectors.groupingBy(Character::toLowerCase,
		 * Collectors.counting())); System.out.println(charFreqMap);
		 */

//		int[] arr = {1, 13, 7, 3, 0, 5, 7};
//
//        // Find the midpoint
//        int mid = arr.length / 2;
//
//        // Sort the first half in ascending order
//        Arrays.sort(arr, 0, mid);
//
//        // Sort the second half in descending order
//        Arrays.sort(arr, mid, arr.length-1);
//        int j = arr.length-1;
//		for (int i = mid; i <= j; i++, j--) {
//
//			int temp = arr[i];
//			arr[i] = arr[j];
//			arr[j] = temp;
//
//		}
//
//        // Print the final sorted array
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//    }
//		
	}

}


	
		
	


