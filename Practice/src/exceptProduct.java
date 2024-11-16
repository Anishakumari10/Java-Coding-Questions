
public class exceptProduct {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4 };
		exceptProduct ep = new exceptProduct();
		ep.productExceptSelf(a);
	}

	class Solution {
	    public int[] productExceptSelf(int[] nums) {

	      	int x = 0;
			int[] ans = new int[nums.length];
			for(int i= 0; i<nums.length ; i++) {
				ans[i] = 1;
			}
			for (int i = 0; i < nums.length; i++) {
				int n = nums[i];

				for (int j = 0; j < nums.length; j++) {
					if (i != j) {
						if (nums[j] == 0) {
							ans[x] = 0;
							break;
						} else {
							ans[x] = ans[x] * nums[j];

						}
					}
				}
				x++;
			}
	        return ans;
	    }
	}
}
