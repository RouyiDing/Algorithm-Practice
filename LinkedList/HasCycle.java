package class3;

/** Check if a given linked list has a cycle. 
 * Return true if it does, otherwise return false.
 * 
 */
public class HasCycle {

	
	class ListNode {
		public int value;
		public ListNode next;

		public ListNode(int value) {
			this.value = value;
			next = null;
		}
	}
	
	public boolean hasCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast){return true;}
		}
	    return false;
	  }
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
