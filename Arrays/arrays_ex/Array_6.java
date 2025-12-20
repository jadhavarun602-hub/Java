package arrays_ex;

//Find the smallest element in an array.

public class Array_6 {

	public static void main(String[] args) {
		
		int [] arr = {44,23,11,66,8,33,223,39};
		
		int small = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(small > arr[i]) {
				small = arr[i];
			}
		}
		
		System.out.println("smallest element in array: "+small);
	}

}
