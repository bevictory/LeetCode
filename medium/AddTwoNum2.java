package medium;

public class AddTwoNum2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode head = new ListNode(0),cur=head;

		while(l1!=null&&l2!=null){
        	int num = carry + l1.val+ l2.val;
        	cur.next = new ListNode(num%10);
        	carry = num /10;
        	l1 = l1.next;
        	l2 = l2.next;
        	cur = cur.next;
        }
		while(l1!=null){
			int num = carry + l1.val;
        	cur.next = new ListNode(num%10);
        	carry = num /10;
        	l1 = l1.next;
        	
        	cur = cur.next;
		}
		while(l2!=null){
			int num = carry + l2.val;
        	cur.next = new ListNode(num%10);
        	carry = num /10;
        	l2 = l2.next;
        	
        	cur = cur.next;
		}
		if(carry!=0) cur.next = new ListNode(carry);
		return head.next;
    }
}
