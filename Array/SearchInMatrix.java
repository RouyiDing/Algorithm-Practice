package class2;

public class SearchInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int[] search(int[][]matrix, int target){
    	
    	// case: N = 1,  M = 1
    	if (matrix.length == 1 && matrix[0].length == 1){
    		if (matrix[0][0] == target){
    			return new int[]{0,0};
    		} else {
    			return new int[]{-1,-1};
    		}
    	}
    	
    	
    	if (matrix[0][0] > target){
    		return new int[]{-1,-1};
    	}
    	
    	// case: N > 1, M > 1
    	int rLeft = 0;
    	int rRight = matrix.length - 1;
    	// find the row index whose first element is the largest smaller or equal to target
    	while (rLeft < rRight - 1){
    		int rMid = rLeft + (rRight - rLeft) / 2;
    		if (matrix[rMid][0] == target){
    			return new int[]{rMid, 0};
    		} else if (matrix[rMid][0] < target){
    			rLeft = rMid;
    		} else if (matrix[rMid][0] > target){
    			rRight = rMid - 1;    // 
    		}
    	}
    	
    	
    	if (matrix[rRight][0] < target){
    		rLeft = rRight;
    	}
    	
  
    	// Search on row with index rLeft to find the target
    	int cLeft = 0;
    	int cRight = matrix[rLeft].length - 1;
    	while (cLeft < cRight){
    		int cMid = cLeft + (cRight - cLeft) / 2;
    		if (matrix[rLeft][cMid] == target){
    			return new int[]{rLeft, cMid};
    		} else if (matrix[rLeft][cMid] < target){
    			cLeft = cMid + 1;
    		} else if (matrix[rLeft][cMid] > target){
    			cRight = cMid - 1;
    		}
    	}
    	
    	if (matrix[rLeft][cLeft] == target){
    		return new int[]{rLeft, cLeft};
    	} else {
    		return new int[]{-1, -1};
    	}
    }

}
