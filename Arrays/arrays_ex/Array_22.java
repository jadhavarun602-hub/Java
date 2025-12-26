package arrays_ex;

// Check whether the array is sorted or not.

public class Array_22 {
	
	public static boolean checkSort(int arr[]) {
		
		for(int i = 0; i < arr.length-1;i++) {
			
			if(arr[i] > arr[i+1]) {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		
		int [] arr = {1,4,5,7,19};
		
	
		if(checkSort(arr)) {
			System.out.println("Array is sorted");
		}else {
			System.out.println("Array is not sorted");
		}

	}

}
