package class1;

public class QuickSort {

	public static void main(String[] args) {
		QuickSort q  = new QuickSort();
		int[] array = new int[]{10,5,-1};
		int[] resul = q.quickSort(array);
		for (int i = 0; i < resul.length; i++){
			System.out.println(resul[i]);
		}
		
		
	}
	

	public int[] quickSort(int[] array) {		 
		if (array == null || array.length == 0 || array.length == 1){
			return array;
		}
		if (array.length == 2){
			if (array[0] > array[1]){
				swap(array,0,1);
			} else {
				return array;
			}
		}
		quickSort(array, 0, array.length - 1);		
		return array;
	}
	
	public void quickSort(int[] array, int left, int right){		
		// base case
		if (left >= right){
			return;
		}		
		int pivotPos = partition(array, left, right);
		quickSort(array, left, pivotPos-1);
		quickSort(array, pivotPos+1, right);		
	}
	
	public int partition(int[] array, int left, int right){
		// set the last element as pivot
		int pivotVal = array[right];
		int pivotPos = right;
		--right;
		while (left <= right){
			if (array[left] <= pivotVal){
				left++;
			} else if (array[right] >= pivotVal){
				right--;
			} else {
				swap(array, left++, right--);
			}
		}
		swap(array, left, pivotPos);
		pivotPos = left;
		return pivotPos;
	}
	
	
	public void swap(int[] arr, int a, int b){
		int tmp = arr[a];
		arr[a] = arr[b];
		arr[b] = tmp;		
	}

}
