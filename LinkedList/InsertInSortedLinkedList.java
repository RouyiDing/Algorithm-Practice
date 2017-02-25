package class3;


/**Insert a value in a sorted linked list.
 * Examples
 * L = null, insert 1, return 1 -> null
 * L = 1 -> 3 -> 5 -> null, insert 2, return 1 -> 2 -> 3 -> 5 -> null
 * L = 1 -> 3 -> 5 -> null, insert 3, return 1 -> 3 -> 3 -> 5 -> null
 * L = 2 -> 3 -> null, insert 1, return 1 -> 2 -> 3 -> null
 */


public class InsertInSortedLinkedList {

	
	public ListNode insert(ListNode head, int value) {
		
		ListNode newNode = new ListNode(value);
		if (head == null){
			return newNode;
		}
			
		ListNode curr = head;
		if (curr.value > value){
			newNode.next = curr;
			return newNode;
		}
		
		
		while (curr.next != null){
			if (value >= curr.value && curr.next.value >= value){
				newNode.next = curr.next;
				curr.next = newNode;
				return head;
			} else {
				curr = curr.next;
			}
		}
		
		curr.next = newNode;
	    return head;
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
