package class3;

public class ReverseLinkedList {

//	public static void main(String[] args) {
//	}

	
	public ListNode reverse_1(ListNode head){
		//base
		if (head == null || head.next == null){
			return head;
		}
		ListNode nextNode = head.next;
		ListNode newHead = reverse_1(nextNode);
		nextNode.next = head;
		head.next = null;
		return newHead;

	}
	
	
	
	public ListNode reverse(ListNode head) {
	    // linked list is null or only has one node
		if (head == null || head.next == null){
			return head;
		}
		
		ListNode curr = head;
		ListNode prev = null;
		ListNode next = head.next;
		
		while (curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	  }
	 

}
