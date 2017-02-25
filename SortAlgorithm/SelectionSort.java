package class1;

public class SelectionSort {

	public static void main(String[] args) {
		

	}

	
	public int[] solve(int[] array) {
		
		// corner case
		if (array == null || array.length == 0){
			return array;
		}
		
		for (int i = 0; i < array.length - 1; i++){
			int min = i;
			for (int j = i+1; j < array.length; j++){
				if (array[min] > array[j]){
					min = j;
				}
			}
			int tmp = array[i];
			array[i] = array[min];
			array[min] = tmp;
			
			
		}
		
		return array;
	}
}
