package class2;

public class KClosest {

	public static void main(String[] args) {

		int[] array = new int[]{1,2,3};
		int target = 2;
		int k = 3;
		int[] out = kClosest_Method1(array, target, k);
//		System.out.println(out.length);
		for (int i = 0; i < out.length; i++){
			System.out.println(out[i]);
		}
		
	}
	
	
	
	public static int[] kClosest_Method1(int[] array, int target, int k){
		int[] result = new int[k];
		if (array == null || array.length == 0 || k == 0){
			return result;
		}
		
		// find the largest smaller or equal integer's index in the array
		int left = 0;
		int right = array.length - 1;
		int start;
		while (left < right - 1){
			int mid  = left + (right - left)/2;
			if (array[mid] <= target){
				left = mid;  // when have duplicate target value, return the larger index
			} else {
				right = mid;
			}		         
		}
		if (array[right] <= target){
			start = right;
		} else {
			start = left;
		}
		
		// expand from start point searching for k closest integers
		int l = start;
		int r = start + 1;
		for (int i = 0; i < k; i++){
			if (r >= array.length || l >= 0 && 
					target - array[l] <= array[r] - target){
				result[i] = array[l--];
			} else {
				result[i] = array[r++];
			}
		}
		
		return result;
	}

}
