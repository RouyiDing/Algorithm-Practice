package class3;

import java.util.Stack;

public class QueueByTwoStack {

	Stack<Integer> s1;
	Stack<Integer> s2;
	
	public QueueByTwoStack() {
	    // Write your solution here.
		s1 = new Stack<>();
		s2 = new Stack<>();
	  }
	  
	
	
	  public Integer poll() {
	    if (this.isEmpty()){
	    	return null;
	    } else if (s2.isEmpty()&& !s1.isEmpty()){
	    	while (!s1.isEmpty()){
	    		s2.push(s1.pop());
	    	}
	    } 
	    return s2.pop();
	  }
	  
	  
	  
	  public void offer(int element) {
		  this.s1.push(element);
	  }
	  
	  
	  
	  public Integer peek() {
		  if (this.isEmpty()){
			  return null;
		  } else if (s2.isEmpty()){
			  while (!s1.isEmpty()){
		    		s2.push(s1.pop());
		    	}
		  }
		  return s2.peek();
	  }
	  
	  
	  
	  public int size() {
		return s1.size() + s2.size();
	  }
	  
	  
	  
	  public boolean isEmpty() {
		if (s1.isEmpty() && s2.isEmpty()){
			return true;
		} else {
			return false;
		}
	    
	  }

}
