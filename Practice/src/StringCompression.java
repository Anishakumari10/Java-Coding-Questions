import java.util.HashMap;
import java.util.Map;

public class StringCompression {

	public static int compress(char[] chars) {

		int count = 1;
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < chars.length; i++) {

			if (!map.containsKey(chars[i])) {
				map.put(chars[i], 1);
			} else {
				count = map.get(chars[i]) + 1;
				map.put(chars[i], count);
			}
 
		}
		String compressedString = "";
		for (Map.Entry<Character, Integer> hm : map.entrySet()) {
			if (hm.getValue() == 1) {
				compressedString = compressedString + hm.getKey().charValue();
			} else {
				compressedString = compressedString + hm.getKey().charValue() + hm.getValue();
			}
		}
		for(int i = 0 ; i < compressedString.length();i++) {
			chars[i] = compressedString.charAt(i);
		}
		return chars.length;

	}

	public static void main(String[] args) {

		char ch[] = { 'a','a','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','b','c' };
		int a = compress(ch);
		System.out.println(a);

	}

}
