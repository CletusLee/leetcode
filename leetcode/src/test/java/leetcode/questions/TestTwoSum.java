package leetcode.questions;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class TestTwoSum {
	
	TwoSum twoSum;
	int nums[];
	int target;
	
	@Before
	public void setUp() {
		twoSum = new TwoSum();
		nums = new int[] {2,7,11,15};
		target = 9;
	}

	@Test
	public void testTwoSum() {
		assertThat(twoSum.twoSum(this.nums, this.target), is(new int[] {0,1}));
	}
	
}
