package packageA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

public class charFrequency {

	public static void main(String[] args) {

		// A = abcdefghijklmnopqrstuvwxyz

		String inputWord = "interviewbit";
		int[] frequency = new int[26]; // Array to store the frequency of each letter

		for (int i = 0; i < inputWord.length(); i++) {
			char ch = inputWord.charAt(i);
			int index = ch - 'a'; // Calculate the index for the letter
			if (index >= 0 && index < 26) { // Check if it's a lowercase letter
				frequency[index]++; // Increment the frequency count for the letter
			} 
		}

		// Print the frequency of each letter
		for (int freq : frequency) {
			System.out.print(freq + " ");
		}
	}
}
