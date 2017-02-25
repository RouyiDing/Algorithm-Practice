package class2;

public class ClassicBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int binarySearch(int[] array, int target){
		if (array == null || array.length == 0){
			return -1;
		}
		
		int left = 0;
		int right = array.length - 1;
		
		while (left <= right){
			int mid = left + (right - left)/2;
			if (array[mid] == target){
				return mid;
			} else if (array[mid] > target){
				right = mid - 1;
			} else {
				left = mid + 1;
			}
			
		}
		
		
		return -1;
	}

}
