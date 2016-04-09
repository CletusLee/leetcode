package leetcode.questions;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TestAddTwoNumbers {

	@Test
	public void testConstructListNodes() {
		ListNode threeListNodes = new ListNode(1,2);
		
		assertThat(threeListNodes.val, is(1));
		assertThat(threeListNodes.next.val, is(2));
		assertThat(threeListNodes.next.next, is(nullValue()));
	}
}
