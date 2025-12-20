package arrays_ex;

// Declare an integer array of size 5 and print all elements.

public class Array_1 {

	public static void main(String[] args) {
		
		int [] arr = new int[5];
		arr[0] = 33;
		arr[1] = 12;
		arr[2] = 89;
		arr[3] = 77;
		arr[4] = 99;
		
//		arr[5] = 23;
		
		for(int i = 0; i < arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
