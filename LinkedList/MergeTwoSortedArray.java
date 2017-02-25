package class3;


/** Merge two sorted lists into one large sorted list
 * L1 = 1 -> 4 -> 6 -> null, L2 = 2 -> 5 -> null, merge L1 and L2 to 1 -> 2 -> 4 -> 5 -> 6 -> null
 * L1 = null, L2 = 1 -> 2 -> null, merge L1 and L2 to 1 -> 2 -> null
 * L1 = null, L2 = null, merge L1 and L2 to null
 * 
 */


public class MergeTwoSortedArray {
	


	public ListNode merge(ListNode one, ListNode two) {

		ListNode dummy = new ListNode(0);
		ListNode curr = dummy;

		while (one != null && two != null) {
			if (one.value <= two.value) {
				curr.next = one;
				curr = one;
				one = one.next;
			} else {
				curr.next = two;
				curr = two;
				two = two.next;
			}
		}
		
		if (one == null && two != null) {
			curr.next = two;
		} else if (one != null && two == null) {
			curr.next = one;
		} else {
			curr.next = null;
		}

		return dummy.next;
	}
	
	
	
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
