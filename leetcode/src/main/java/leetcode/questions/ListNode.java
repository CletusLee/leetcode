package leetcode.questions;

import java.util.stream.IntStream;

public class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
	
	ListNode(int... vals) {
		this.val = vals[0];
		
		IntStream.range(1, vals.length).forEach(index -> {
			ListNode newNode = new ListNode(vals[index]);
			this.next = newNode;
		});
	}
}
