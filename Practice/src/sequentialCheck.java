public class sequentialCheck {

	public static void main(String[] args) {

		String word;
		String ans = " ";

		word = "AMEER"; // RNDEEP

		for (int i = 0; i < word.length(); i++) {

			char ch = word.charAt(i);

			if (i < word.length() - 1 && vowelCheck(word.charAt(i)) == vowelCheck(word.charAt(i + 1))) {
				ans = ans + word.charAt(i) + word.charAt(i + 1);
				i = i + 1;
			} else if (vowelCheck(word.charAt(i))) {
				continue;
 
			} else
				ans = ans + ch;
		}
		System.out.print("Result:" + ans);
	}

	public static boolean vowelCheck(char ch) {
		if ((ch == 'a') || (ch == 'A') || (ch == 'e') || (ch == 'E') || (ch == 'i') || (ch == 'I') || (ch == 'o')
				|| (ch == 'O') || (ch == 'u') || (ch == 'U'))
			return true;
		else
			return false;

	}

}
