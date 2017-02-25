package class2;

import java.util.List;
import java.util.ArrayList;

class Dictionary {
	List<Integer> list = new ArrayList<>();
	
	public Integer get(int index) {
		if(index >= list.size()) {
			return null;
		} else {
			return list.get(index);
		}
	}
	
	public void add(int i){
		list.add(i);
	}
}


// You do not need to implement the Dictionary interface.
// You can use it directly, the implementation is provided when testing your solution.

public class Search {

	public static void main(String[] args) {
		
		Dictionary dict = new Dictionary();
		dict.add(1);
		dict.add(3);
//		dict.add(5);
		

		System.out.println(search(dict, 3));
		
		

	}
	
	  public static int search(Dictionary dict, int target) {

	      // case: dict has no integer
			  if (dict.get(0) == null){
				  return -1;
			  }
			  
			  // case: dict has only one integer
			  if (dict.get(0) != null && dict.get(1) == null) {
			    if (dict.get(0) == target){
			      return 0;
			    } else {
			      return -1;
			    }
			  }
			  
			  // tight the search area
			  int i = 1;
			  int left;
			  int right;
			  while (dict.get(i-1) != null){
				  i = i * 2;
			  }
			  left = i/2 - 1;
			  right = i-1;
			  // find the size of the dictionary, left is the first null
			  while (left < right){
				  int mid = left + (right - left) / 2;
				  if (dict.get(mid) != null){
					  left = mid + 1;
				  } else {
					  right = mid; 
				  }
			  }
			  
//			  int size = left;
			  System.out.println("Input size: " + left);
			  // find the target
			  int l = 0;
			  int r = left - 1;
			  while (l < r){
				  int m = l + (r - l) / 2;
				  if (dict.get(m) == target){
					  return m;
				  } else if (dict.get(m) < target){
					  l = m + 1;
				  } else {
					  r = m - 1;
				  }
			  }
			  
			  if (dict.get(l) == target){
				  return l;
			  } else {
				  return -1;
			  }
		  
	  }
	
	
	

}
