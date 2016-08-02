package medium;

public class ReverseListInKgroup25 {
    public ListNode reverseKGroup(ListNode head, int k) {
    	int length = 0;
        if(head ==null) return null;
        
        ListNode  hh  = new ListNode(0),curListNode;
        hh.next = head;
        while(head!=null){
        	length++;
        	head = head.next;
        }head = hh.next;
        if(length <k ) return head;
        
        curListNode=hh;
        hh.next=null;
        while(length >=k){
        	for(int i =0;i<k;i++){
        		ListNode tmp = head.next;
        		head.next = curListNode.next;
        		curListNode.next = head;
        		head = tmp;
        	}
        	while(curListNode.next!=null) curListNode= curListNode.next;
        	length-=k;
        	
        }
        
        curListNode.next=head;
        return hh.next; 
    }
}
