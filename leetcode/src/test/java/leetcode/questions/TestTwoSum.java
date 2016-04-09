package leetcode.questions;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

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
	@Ignore
	public void testTwoSum() {
		assertThat(twoSum.find(this.nums, this.target), is(new int[] {0,1}));
	}
	
	@Test
	public void testGetUpperBoundIndexByTheTarget() {
		assertThat(twoSum.findUpperBoundIndex(this.nums, target), is(1));
	}
	
	@Test
	public void testGetUpperBoundIndexOnLowerEdgeCase() {
		assertThat(twoSum.findUpperBoundIndex(this.nums, 1), is(0));
	}
}
