package class3;

import java.util.Deque;
import java.util.LinkedList;

/** Enhance the stack implementation to support min() operation.  
 * pop() - remove and return the top element, if empty, return -1
 * push(int element) - push the element to top
 * top() - return the top element without remove it, if empty, return -1
 * min() - return the current min value in the stack. If empty, return -1.
 */

public class StackWithMin {
	private Deque<Integer> stack;
	private Deque<Integer> minStack;

	
	
	public StackWithMin() {
		stack = new LinkedList<Integer>();
		minStack = new LinkedList<Integer>();
		
	  }
	  
	  public int pop() {
	    if (stack.isEmpty()){
	    	return  -1;
	    } else {
	    	if (minStack.peekFirst() == stack.peekFirst()){
	    		minStack.pollFirst();
	    	}
	    	return stack.pollFirst();
	    }
	  }
	  
	  public void push(int element) {
	    stack.offerFirst(element);
	    if (minStack.isEmpty() || minStack.peekFirst() >= element){
	    	minStack.offerFirst(element);
	    }
	  }
	  
	  public int top() {
	    if (stack.isEmpty()){
	    	return -1;
	    } else {
	    	return stack.peekFirst();
	    }
	  }
	  
	  public int min() {
	    if (minStack.isEmpty()){
	    	return -1;
	    } else {
	    	return minStack.peekFirst();
	    }
	  }

}
