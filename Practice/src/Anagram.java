
public class Anagram {

	public static void main(String[] args) {
		String word1 = "aab";
		String word2 = "abb";

		word1 = word1.toLowerCase();
		word2 = word2.toLowerCase();
		int sum1 = 0;
		int sum2 = 0;
		if (word1.length() == word2.length()) {
			for (int i = 0; i < word1.length(); i++) {

				char c1 = word1.charAt(i);
				sum1 = sum1 + (int) c1;
				char c2 = word2.charAt(i);
				sum2 = sum2 + (int) c2;
			}
			if (sum1 == sum2) {
				System.out.println("Anagram.");
			} else {
				System.out.println("Not Anagram.");
			}
		} else {
			System.out.println("Words length don't match Not an Anagram.");
		}

	}

}
