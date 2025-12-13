package methods_ex;

//Write a method to find the maximum element in an array.

public class Method_19 {
	
	public static int findMax(int [] arr) {
		
		int max = 0;
		
		for(int i = 0; i < arr.length; i++ ) {
			
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		
		int arr [] = {23,55,8,76,23,86,33,10};
		
		int result = findMax(arr);
		
		System.out.print("maximum element in array: "+result);
		
	}

}
