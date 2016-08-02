package medium;

public class PartitionList86 {
	public ListNode partition(ListNode head, int x) {
		if(head==null) return head;
        ListNode hNode = new ListNode(0);
        hNode.next = head;
        head = hNode;
        ListNode smalListNode = head;
        
        while(smalListNode.next!=null&&smalListNode.next.val<x){
        	smalListNode = smalListNode.next;
        	
        }
        
        if(smalListNode.next !=null) {
        	
        	head = smalListNode.next;
        }
        else return hNode.next;
        while(head.next!=null){
        	if(head.next.val <x){
        		ListNode tmp = head.next.next;
        		head.next.next = smalListNode.next;
        		smalListNode.next = head.next;
        		smalListNode =smalListNode.next;
        		head .next=tmp;
        		
        	}else{
        		head = head.next;
        	}
        }
        return hNode.next;
    }
}
