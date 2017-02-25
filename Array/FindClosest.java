package class2;

public class FindClosest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(closest(null,4));
	}
	
	public static int closest(int[] array, int target){
		if (array == null || array.length == 0){
			return -1;
		}
		
		if (array.length == 1) return 0;
		
		int left = 0;
		int right = array.length - 1;
		while (left < right - 1){
			int mid = left + (right - left)/2;
			if (array[mid] == target){
				return mid;
			} else if (array[mid] < target){
				left = mid;
			} else {
				right = mid;
			}
		}
		
		// check closest
		if (Math.abs(array[left] - target) < Math.abs(array[right] - target)){
			return left;
		} else {
			return right;
		}
	}

}
