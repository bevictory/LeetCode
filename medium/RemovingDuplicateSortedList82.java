package medium;

public class RemovingDuplicateSortedList82 {
	public ListNode deleteDuplicates(ListNode head) {
        if(head ==null|| head.next ==null){
        	return head;
        }
        ListNode preListNode=null,curListNode = head;
        while(curListNode!=null&&curListNode.next!=null){
        	if(curListNode.val !=curListNode.next.val){
        		preListNode = curListNode;
        		curListNode = curListNode.next;
        	}else{
        		int val = curListNode.val;
        		while(curListNode!=null&&val == curListNode.val){
        			curListNode= curListNode.next;
        		}
        		if(preListNode==null){
        			head = curListNode;
        		}else{
        			preListNode.next = curListNode;
        			
        		}
        	}
    
        }
        return head;
        
    }
}
