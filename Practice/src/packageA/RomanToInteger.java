package packageA;

import java.util.HashMap;

public class RomanToInteger {

	public static void main(String[] args) {
		String s = "III";
		HashMap<Character, Integer> ref = new HashMap<>();
		ref.put('I', 1);
		ref.put('V', 5);
		ref.put('X', 10);
		ref.put('L', 50);
		ref.put('C', 100);
		ref.put('D', 500);
		ref.put('M', 1000);

		int res = 0;
		int i = 0;
		char c[] = s.toCharArray();
		while (i < c.length) {

			if ((i < c.length - 1) && (ref.get(c[i]) < ref.get(c[i + 1]))) {
				res += (ref.get(c[i + 1]) - ref.get(c[i]));
				i = i + 2;

			} else {
				res += ref.get(c[i]);
				i++;
			}

		}
		System.out.println(res);
	}

}
