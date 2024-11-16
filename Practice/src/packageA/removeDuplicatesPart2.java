package packageA;

public class removeDuplicatesPart2 {

	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0)
			return 0;

		int k = 1; // Start from the second element
		int count = 1; // Count occurrences of the current number

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i-1]) {
				if (count < 2) {
					nums[k] = nums[i];
					k++;
				}
				count++;
			} else {
				nums[k] = nums[i];
				k++;
				count = 1; // Reset count for the new number
			}
		}
		for (int i = 0; i < k; i++) {
			System.out.println(nums[i]);
		}
		return k;
	}

	public static void main(String[] args) {
		int nums[] = { 1, 1, 1, 2, 2, 3 };
		removeDuplicatesPart2.removeDuplicates(nums);

	}

}
