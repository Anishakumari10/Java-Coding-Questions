
public class nextCharacter {

	public static void main(String[] args) {

		String a = "abcdez";
		String b = "";

		for (int i = 0; i < a.length(); i++) {

			char c = a.charAt(i);

			if (c >= 'a' && c <= 'z') { // 65+26=91

				if (c == 'z') {
					c = 'a';
				} else
					c++;

				b = b + c;

			}

		}
		System.out.println(b);

	}

}
