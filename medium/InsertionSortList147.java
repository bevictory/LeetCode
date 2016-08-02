package medium;

public class InsertionSortList147 {	
	public ListNode insertionSortList(ListNode head) {
		ListNode h = new ListNode(0);
		
		ListNode node = head;
		while(head!=null){
			node =h;
			ListNode tmp = head.next;
			while(node.next!=null&&head.val>node.next.val){
				node=node.next;
			}
			
			head.next=node.next;
			node.next=head;
			head = tmp;
		}
		return h.next;
    }
}
