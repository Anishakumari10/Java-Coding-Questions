
public class MaximumArrayLength {

	public static void main(String[] args) {

		int a[] = { 1, 3, 5, 6, 6, 6, 6, 6, 6, 6, 6, 7, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 1, 5 };
		int i = 0, j = i + 1;
		int maxCount = 0, count = 0;
		while (i < j && j < a.length) {
			if (a[i] == a[j]) {
				++count;
				maxCount = Math.max(count, maxCount);
				i++;
				j++;

			} else if (a[i] != a[j]) {
				i++;
				j++;
				count = 0;
			}

		}
		System.out.println("Maximum length" + (maxCount + 1));
	}
}
