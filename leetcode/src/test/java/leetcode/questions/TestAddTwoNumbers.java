package leetcode.questions;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TestAddTwoNumbers {
	
	@Test
	public void testConstructListNodes() {
		ListNode threeListNodes = new ListNode(1,2, 3);
		
		assertThat(threeListNodes.val, is(1));
		assertThat(threeListNodes.next.val, is(2));
		assertThat(threeListNodes.next.next.val, is(3));
		assertThat(threeListNodes.next.next.next, is(nullValue()));
	}
	
	@Test
	public void testAddTwoNumbersWithTheSameLength() {
		ListNode l1 = new ListNode(2,4,3);
		ListNode l2 = new ListNode(5,6,4);
		
		ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);
		
		assertThat(result.val, is(7));
		assertThat(result.next.val, is(0));
		assertThat(result.next.next.val, is(8));
	}
}
