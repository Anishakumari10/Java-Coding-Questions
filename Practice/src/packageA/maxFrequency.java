package packageA;

import java.util.HashMap;
import java.util.Map;

public class maxFrequency {

	public static void main(String[] args) {

		// ANISHA - A -2,N-1,S-1,H-1
		String name = "AABBCDDDDDE";

		char CharLetters[] = name.toCharArray();
		//int count = 1;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (char c : CharLetters) {
			if (!hm.containsKey(c)) {
				hm.put(c, 1); 

			} else {
				int count = hm.get(c);
				hm.put(c, count+1);
		}
		}
		for (Map.Entry<Character, Integer> m : hm.entrySet()) {
			System.out.println(m.getKey() + "-" + m.getValue());
		}
	}
}
