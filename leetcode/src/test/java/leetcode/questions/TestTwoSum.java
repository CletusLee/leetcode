package leetcode.questions;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TestTwoSum {
	
	TwoSum twoSum = new TwoSum();
	
	@Test
	public void testTwoSum() {
		int nums[] = new int[] {2,7,11,15};
		int target = 9;
		
		assertThat(twoSum.twoSum(nums, target), is(new int[] {0,1}));
	}
	
}
