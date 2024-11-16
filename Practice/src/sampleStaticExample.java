public class sampleStaticExample {

	public static int[] findFirstLastIndex(int nums[], int target) {
		int flag = 0;
		int ans[] = new int[2];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target && flag == 0) {
				flag = 1;
				ans[0] = i;
			} else if ((flag == 1) && (nums[i] != target)) {
				ans[1] = i - 1;
				flag = 0;
			} else if ((nums.length == 0) || (nums[i] != target)) {
				ans[0] = -1;
				ans[1] = -1;

			}
		} 

		return ans;
	}

	public static void main(String[] args) {
		int arr[] = {};

		int ans[] = findFirstLastIndex(arr, 0);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]);
		}

	}
}