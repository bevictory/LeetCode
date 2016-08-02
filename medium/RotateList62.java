package medium;

public class RotateList62 {
	public ListNode rotateRight(ListNode head, int k) {
        int len =0;
        ListNode hListNode  = new ListNode(0);
        hListNode.next = head;
        if(head==null) return null; 
        while(head!=null){
        	head=head.next;
        	len++;
        }
        k = k%len;
        ListNode curListNode = hListNode,pListNode= hListNode;
        for(int i =0 ;i<k ;i++){
        	curListNode = curListNode.next;
        }
        while(curListNode.next!=null){
        	curListNode = curListNode.next;
        	pListNode = pListNode.next;
        }
        curListNode.next = hListNode.next;
        hListNode.next=pListNode.next;

        pListNode.next=null;
        return hListNode.next;
    }
}
