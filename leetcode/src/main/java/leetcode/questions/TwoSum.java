package leetcode.questions;

public class TwoSum {

	public int[] find(int[] nums, int target) {
		return null;
	}

	public int findUpperBoundIndex(int[] nums, int target) {
		if(target < nums[0]) {
			return 0; 
		} else if(nums[nums.length-1] < target){
			return nums.length - 1;
		} else {
			return 1;
		}
	}

}
