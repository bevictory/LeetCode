package code;

public class removeLastN19 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode h =  new ListNode(0);
        h.next = head;
        head=h;
        ListNode pre = h;
        while(n-->0){
        	head = head.next;
        }
        while(head.next!=null){
        	pre = pre.next;
        	head= head.next;
        }
        pre.next= pre.next.next;
        return h.next;
    }

}
