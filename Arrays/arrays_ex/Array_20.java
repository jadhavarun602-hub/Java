package arrays_ex;

//Find the sum of all even-index elements in an array.

public class Array_20 {

	public static void main(String[] args) {
		
		int [] arr = {12,45,67,89,54,32,56,90,11,25};
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(i % 2 == 0) {
				sum += arr[i];
//				System.out.println(arr[i]);
			}
		}
		
		System.out.println("Sum of even-index is: "+sum);

	}

}
