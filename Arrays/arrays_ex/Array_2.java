package arrays_ex;

// Find the sum of all elements in an array.

public class Array_2 {

	public static void main(String[] args) {
		
		int [] num = {23,45,61,55,12,89,76};
		
		int sum = 0;
		
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		
		System.out.println("Sum of All Element: "+sum);
	}

}
