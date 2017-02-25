package class2;

public class FindFirstOcurr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int[] array = new int[]{4,5,5,5,5,5,5};
	System.out.println(firstOccur(array, 4));

	}
	
	public static int firstOccur(int[] array, int target){
		if (array == null || array.length == 0){
			return -1;
		}
		int left = 0;
		int right = array.length - 1;
		while (left < right){
			int mid = left + (right - left)/2;
			if (array[mid] == target){
				right = mid;
			} else if (array[mid] < target){
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}	
		if (right >= 0 && array[right] == target){
			return right;
		} else {
			return -1;
		}

	}

}
