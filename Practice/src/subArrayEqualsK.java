
public class subArrayEqualsK {

	public static int subarraySum(int[] nums, int k) {

		int i = 0, sum = 0, count = 0, j = 0;

		if (nums[i] < k) {
			j = i + 1;
			sum = sum + nums[i] + nums[j];
		} else if (nums[i] == k) {
			count += 1;
			System.out.println(count);
			sum = 0;
		}
		while (i < j && j < nums.length) {
			//sum = sum + nums[i] + nums[j];
			if (sum != k) {
				j++;
			} else if (sum == k && i < nums.length) {
				count += 1;
				System.out.println(count);
				sum = 0;
				i++;
				if (j >= nums.length)
					break;
				else 
					j++;
			} else if (nums[i] == k) {
				count += 1;
				System.out.println(count);
				sum = 0;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		
		int nums[] = {1,1,1};
		int sum = subarraySum(nums,2);
		System.out.println(sum);

	}

}
