package code;

public class RemoveListElement203 {
	public ListNode removeElements(ListNode head, int val) {
		if(head ==null) return null;
		ListNode h = new ListNode(0);
		h.next = head;
		ListNode pre = h;
		 
		while(head!=null){
			if(head.val == val){
				pre.next=head.next;
				
			}
			else pre=head;
			head =head.next;
			
		}
		
		return h.next;
    }
}
