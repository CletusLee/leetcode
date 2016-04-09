package leetcode.questions;

import java.util.stream.IntStream;

public class ListNode {
	int val;
	ListNode next;
	ListNode(int x) { val = x; }
	
	ListNode(int... vals) {
		this.val = vals[0];
		ListNode cur = this;
		
		for(int index = 1; index < vals.length; index++) {
			ListNode newNode = new ListNode(vals[index]);
			cur.next = newNode;
			cur = newNode;
		}
	}
}
