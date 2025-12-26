package arrays_ex;

// Rotate the array right by one position.

public class Array_25 {
	
	public static void RightRotateByOne(int [] arr) {
		
		int last = arr[arr.length-1];
		
		for(int i = arr.length-1; i > 0; i--) {
			arr[i] = arr[i -1]; 
		}
		
		arr[0] = last;
		
	}

	public static void main(String[] args) {
		
		int [] array = {1,2,3,4,5,6,7,8,9};

		RightRotateByOne(array);
		
		for(int num : array) {
			System.out.print(num+" ");
		}
	}

}
