package arrays_ex;

// Rotate the array left by one position.

public class Array_24 {
	
	public static void LeftRotateByOne(int [] arr) {
		
		int first = arr[0];
		
		for(int i = 0; i < arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		
		arr[arr.length-1] = first;
	}

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,5,6,7,8,9};
		
		LeftRotateByOne(arr);
		
		for(int num : arr) {
			System.out.println(num);
		}

	}

}
