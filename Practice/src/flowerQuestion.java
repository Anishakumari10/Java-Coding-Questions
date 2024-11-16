
public class flowerQuestion {

	public boolean canPlaceFlowers(int[] flowerbed, int n) {

		boolean flag = true;
		int len = flowerbed.length;
		for (int i = 0; i < len; i++) {

			if (i <= len && flowerbed[i] == 1) {

				i = i + 2;
				if (i == len)
					break;
			}
			if (flowerbed[i] == 0 && ((i == len - 1) || (i < len && flowerbed[i - 1] != 1)
					|| (i < len && flowerbed[i + 1] != 1 && flowerbed[i - 1] != 1)
					|| (i == len - 1 && flowerbed[i - 1] != 1))) {

				flowerbed[i] = 1;
				System.out.println("n" + n);
				n = n - 1;
				if (i == len || n <= 0)
					break;
				i = i + 1;

			}
			
		}
		for (int i : flowerbed) {
			System.out.println(i);
		}
		System.out.print("value of n" + n);
		if (n == 0) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	public static void main(String[] args) {

		flowerQuestion fq = new flowerQuestion();
		int arr[] = { 1, 0, 1, 0, 0, 1, 0 };
		fq.canPlaceFlowers(arr, 1);

	}

}
