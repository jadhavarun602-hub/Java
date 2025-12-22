package arrays_ex;

//Copy elements from one array to another.

public class Array_12 {

	public static void main(String[] args) {
		
		int [] ele = {12,23,34,45,56,67,78,89,90};
		
		int [] copy = new int[ele.length];
		
		
		for(int i = 0; i < ele.length; i++) {
			copy[i] = ele[i];
		}
		
		for(int i = 0; i < copy.length; i++) {
			System.out.print(copy[i]+" ");
		}

	}

}
