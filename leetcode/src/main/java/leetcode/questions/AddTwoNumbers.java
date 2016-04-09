package leetcode.questions;

public class AddTwoNumbers {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode cur = result;
		while(true) {
			int sum = l1.val + l2.val;
			int mod = sum % 10;
			int quo = sum / 10;
			
			cur.val += mod;
			
			if(quo != 0) {
				cur.next = new ListNode(quo);
			}
			
			if(l1.next == null) {
				break;
			} else {
				if(cur.next == null) {
					cur.next = new ListNode(0);			
				}

				cur = cur.next;
				l1 = l1.next;
				l2 = l2.next;
			}
		}
		
		return result;
	}
	
}
