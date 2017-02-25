package class3;

/**
 * Given a linked list and a target value T, partition it such that all nodes 
 * less than T are listed before the nodes larger than or equal to target value
 * T. The original relative order of the nodes in each of the two partitions
 * should be preserved.
 *
 */
class ListNode {
	public int value;
	public ListNode next;

	public ListNode(int value) {
		this.value = value;
		next = null;
	}
}
public class PartitionLinkedList {

	
	
	public static void main(String[] args) {
		int[] value = new int[]{7,6,5,4,3,2,1};
		ListNode head = new ListNode(8);
		ListNode curr = head;
		for (int i : value){
			curr.next = new ListNode(i);
			curr = curr.next;
		}
		
		ListNode output = partition(head, 5);
		while (output != null){
			System.out.print(output.value);
			output = output.next;
		}
	
}

	public static ListNode partition(ListNode head, int target) {
		if (head == null || head.next == null){
			return head;
		}
		
		ListNode left = new ListNode(0);
		ListNode leftHead = left;
		ListNode right = new ListNode(0);
		ListNode rightHead = right;
		System.out.println(head.value);
		while (head != null){
			if (head.value < target){
				left.next = head;
				left = left.next;
				System.out.println("<: " + head.value);
			} else {
				right.next = head;
				right = right.next;
				System.out.println(">=: " + head.value);
			}
			
			head = head.next;
		}
		
		right.next = null;
		left.next = rightHead.next;
		return leftHead.next;
	}
	

}
