package class3;

/** Reorder the given singly-linked list N1 -> N2 -> N3 -> N4 -> бн -> Nn -> null
 *  to be N1- > Nn -> N2 -> Nn-1 -> N3 -> Nn-2 -> бн -> null
 *  */

public class ReOrderLinkedList {
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		ListNode out = reorder(head);
		while (out != null){
			System.out.println(out.value);	
			out = out.next;
		}


	}

	
	
	public static ListNode reorder(ListNode head) {
		if (head == null || head.next == null || head.next.next == null){
			return head;
		}
		
		ListNode middle = findMiddle(head);	
		ListNode reversed = reverse(middle.next);
		middle.next = null;
		
		ListNode dummy = head;

		while (reversed != null){
			ListNode nextInsert = reversed.next;
			reversed.next = head.next;
			head.next = reversed;
			head = head.next;
			reversed = nextInsert;
		}
		
		return dummy; 
	}
	
	
	private static ListNode findMiddle(ListNode head){
	    if (head == null || head.next == null){
	    	return head;
	    }
	    
	    ListNode slow = head;
	    ListNode fast = head;
	    while (fast.next != null && fast.next.next != null){
	    	slow = slow.next;
	    	fast = fast.next.next;
	    }
//	    System.out.println("middle:"+slow.value);
	    return slow;
	}
	
	
	
	private static ListNode reverse(ListNode head){
		if (head == null || head.next == null){
			return head;
		}
		
		ListNode nextNode = head.next;
		ListNode newHead = reverse(nextNode);
		nextNode.next = head;
		head.next = null;
		
		return newHead;
		
		
	}
	 
	 
	 
}
