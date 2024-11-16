package packageA;

public class minSubArrayLength {
	
	//public int minSubArrayLen(int target, int[] nums) {
	
	public static void main(String[] args) {

		int nums[] = {1,2,3,4,5};
		int target = 11;

		int i = 0, j = i + 1, sum = 0, min = Integer.MAX_VALUE;

		sum = nums[i] + nums[j];
		while (i < j) {
			if (target == nums[i] || target == nums[j]) {
				min = 1;
				System.out.println(min);
				break;

			}

			else if (sum < target) {
				System.out.println("j value: " + j);
				j++;
				if (j < nums.length) {
					sum += nums[j];
				} else {
					min = 0;
					break;
				}
			} else if (sum > target) {
				i++;
				sum -= nums[i - 1];

			} else if (sum >= target) {
				min = Math.min(min, j - i + 1);
				System.out.println("Min: " + min);
				j++;
				if (j < nums.length)
					sum += nums[j];
				else
					break;

			} else
				min = 0;
			System.out.println(min);
		}
		System.out.println("i value: " + i);
		System.out.println("Final: " + min);
	}
}


