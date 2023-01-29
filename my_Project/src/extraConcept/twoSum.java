package extraConcept;

class Solution {
	public int[] twoSum(int[] nums, int target) {
		int[] nums1 = null;
		for (int i = 0; i < nums.length; i++) {

			int sumTotal = nums[i] + nums[i + 1];
			if (sumTotal == target)
				;
			{
				System.out.println("matches index are: [" + nums[i] + "," + nums[i + 1] + "]");
				int[] nums2 = { nums[i], nums[i + 1] };
				nums2 = nums1;
				break;
			}
		}
		return nums1;

	}
}

public class twoSum {
	public static void main(String[] args) {
		Solution solutions = new Solution();
		//solutions.twoSum({2,15,11,7},9);
	}
}
