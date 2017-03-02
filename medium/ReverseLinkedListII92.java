package medium;

public class ReverseLinkedListII92 {
	 	public ListNode reverseBetween(ListNode head, int m, int n) {
	        if(m==n) return head;
	 		ListNode hNode = new ListNode(0);
	        hNode.next = head;
	        head = hNode;
	        //preListNode ָʾ��ת��ǰ���ڵ�
	        ListNode preListNode=hNode;
	 		for(int i=0;i<m-1;i++){
	        	head = head.next;
	 		}
	 		
	 		preListNode = head;
	 		ListNode reverseLastNode = head.next;
	 		//reverseLastNodeָʾ��ת������һ���ڵ�
	 		head = head.next;
	 		//��ʼ��ת����
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
