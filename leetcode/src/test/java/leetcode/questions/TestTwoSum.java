package leetcode.questions;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class TestTwoSum {
	
	TwoSum twoSum;
	
	@Before
	public void setUp() {
		twoSum = new TwoSum();
	}

	@Test
	@Ignore
	public void firstTwoSum() {
		int nums[] = {2,7,11,15};
		int target = 9;
		
		assertThat(twoSum.find(nums), is(new int[] {0,1}));
	}
}
