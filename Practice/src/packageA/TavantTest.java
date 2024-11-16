package packageA;

import java.util.HashMap;
import java.util.Map.Entry;

public class TavantTest {

	public static void main(String[] args) {

		String str = "AnishaKhumari";

		HashMap<Character, Integer> hm = new HashMap<>();
		char c[] = str.toCharArray();

		for (Character c1 : c) {
//			if (hm.containsKey(c1)) {
//				hm.put(c1, hm.get(c1) + 1);
//			} else {
//				hm.put(c1, 1);
//			}
			hm.put(c1, hm.getOrDefault(c1, 0) + 1);

		}
		for (Entry<Character, Integer> map : hm.entrySet()) {
			System.out.println(map.getKey() + " -> " + map.getValue());
		}

	}

}
