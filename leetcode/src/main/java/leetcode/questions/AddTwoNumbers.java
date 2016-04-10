package leetcode.questions;

public class AddTwoNumbers {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode result = new ListNode(0);
		ListNode resultCur = result;
		while(true) {
			int sum = 0;
			if(l1 != null) {
				sum = l1.val;
			}
			
			if(l2 != null) {
				sum += l2.val;
			}
			
			sum += resultCur.val;
			
			int mod = sum % 10;
			int carry = sum / 10;
			
			resultCur.val = mod;
			
			if(carry != 0) {
				resultCur.next = new ListNode(carry);
			}
			
			if(shouldStopComputing(l1, l2)) {
				break;
			} else {
				if(resultCur.next == null) {
					resultCur.next = new ListNode(0);			
				}

				resultCur = resultCur.next;
				if(l1 != null) {
					l1 = l1.next;
				}
				
				if(l2 != null) {
					l2 = l2.next;
				}
			}
		}
		
		return result;
	}

	private static boolean shouldStopComputing(ListNode l1, ListNode l2) {
		return (l1 == null || l1.next == null) && (l2 == null || l2.next == null);
	}
	
}
