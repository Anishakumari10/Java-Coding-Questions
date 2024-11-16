package packageA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateCharacters {

	public static void removeDuplicates(String s) {

		Set<Character> hs = new LinkedHashSet<>();

//		String noDupStr = "";
		char[] charArray = s.toCharArray();

		for (Character c : charArray) {
			hs.add(c);
		}
//		Arrays.sort(charArray);

//		for (int i = 0; i < charArray.length-1; i++) {
//			if (charArray[i] == charArray[i+1]) {
//				continue;
//			}
//			else {
//				noDupStr = noDupStr + charArray[i];
//			}
//
//		}
		String s1 = "";
		for (Character c : hs) {
			s1 = s1 + c;
		}

		System.out.println(s1);
	}

	public static void main(String[] args) {

		String s = "HappyNewYear";
		DuplicateCharacters.removeDuplicates(s);

	}

}
