package arrays_ex;

//Find the second largest element in an array.

public class Array_18 {

	public static void main(String[] args) {
		
		int [] arr = {12,43,8,76,54,33,22,98,47};
		
		int largest = Integer.MIN_VALUE;
		int secLargest = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] > largest) {
				secLargest = largest;
				largest = arr[i];
			}else if(arr[i] > secLargest && arr[i] != largest){
				secLargest = arr[i];
			}
		}
		
		System.out.println("Second largest element: " + secLargest);

	}

}
