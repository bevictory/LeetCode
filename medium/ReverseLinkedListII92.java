package medium;

public class ReverseLinkedListII92 {
	 	public ListNode reverseBetween(ListNode head, int m, int n) {
	        if(m==n) return head;
	 		ListNode hNode = new ListNode(0);
	        hNode.next = head;
	        head = hNode;
	        //preListNode 指示反转的前驱节点
	        ListNode preListNode=hNode;
	 		for(int i=0;i<m-1;i++){
	        	head = head.next;
	 		}
	 		
	 		preListNode = head;
	 		ListNode reverseLastNode = head.next;
	 		//reverseLastNode指示反转后的最后一个节点
	 		head = head.next;
	 		//开始反转操作
	 		for(int i=m+1;i<=n;i++){
	 			if(i==m+1) head =head.next;
	 			ListNode  tmpListNode = head.next;
	 			head.next = preListNode.next;
	 			preListNode.next = head;
	 			head = tmpListNode;
	 		}
	 		reverseLastNode.next =head;
	 		return hNode.next;
	 	}
}
