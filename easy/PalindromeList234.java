package code;

public class PalindromeList234 {
	private ListNode h;
	public boolean isPalindrome(ListNode head) {
      
        if(head == null ||head.next==null) return true;
        h = head;
        return deal(head);
    }
	public boolean deal(ListNode head){
		if(head == null) return true;
		if(deal(head.next) ==false) return false;
		if(h.val != head.val) return false;
		else {
			h= h.next;
			return true;
		}
		
	}
	

}
