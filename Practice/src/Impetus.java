public class Impetus {

	public static String mergeAlternately(String word1, String word2) {

		int i = word1.length();
		int j = word2.length();
		int x = 0, y = 0;
		String mergedStr = "";

		while (i != x || j != y) {

			if (j == y && x != i) {

				mergedStr = mergedStr + word1.charAt(x);
				x++;

			} else if (i == x && y != j) {

				mergedStr = mergedStr + word2.charAt(y);
				y++;

			} else {
				mergedStr = mergedStr + word1.charAt(x) + word2.charAt(y);
				x++;
				y++;
			}
		}
		return mergedStr;

	}

	public static void main(String[] args) {
		String merged = mergeAlternately("ab", "pqrs");
		System.out.println(merged);

	}

}
