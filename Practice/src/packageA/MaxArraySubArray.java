package packageA;

public class MaxArraySubArray {
//sliding window 
	public static double findMaxAverage(int[] nums, int k) {

		double sum = 0.0, maxAvgSum = Double.NEGATIVE_INFINITY;
		if (nums.length == 1)
			return nums[0];

	        double maxSum = 0.0;
	        for (int i = 0; i < k; i++) {
	            sum = sum + nums[i];
	        }
	        int startIndex = 0;
	        int endIndex = k;
	        while (startIndex < endIndex && endIndex < nums.length) 
	        {
	            sum = sum - nums[startIndex];
	            startIndex++;

	            sum = sum + nums[endIndex];
	            endIndex++;
	            
	            sum = sum/k;
	            maxSum = Math.max(sum, maxSum);
	            
	        }
		System.out.print(maxSum);
		return maxSum;
	}

	public static void main(String[] args) {

		int nums[] = {1,12,-5,-6,50,3};
		findMaxAverage(nums, 4);

	}
}
