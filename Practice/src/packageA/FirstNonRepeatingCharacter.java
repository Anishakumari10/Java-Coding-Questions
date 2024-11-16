package packageA;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {

		String s = "sttress";
		int count = 1;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		/* for (int i = 0; i < s.toCharArray().length; i++) {
			if (!hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), count);
			} else {
				count = hm.get(s.charAt(i)) + 1;
				hm.put(s.charAt(i), count);
			}
		 
		} */
		
		for (char c : s.toCharArray()) {
			hm.put(c,hm.getOrDefault(c, 0)+1);
		}
		
		
		for (char c : s.toCharArray()) {
            if (hm.get(c) == 1) {
                System.out.println("First non-repeating character: " + c);
                break;
            }
		}
	}

}
