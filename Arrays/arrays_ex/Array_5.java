package arrays_ex;

//Find the largest element in an array.

public class Array_5 {

	public static void main(String[] args) {
		
		int [] ele = {12,51,87,45,23,11,45,5};
		
		int larg = ele[0];
		
		for(int i = 0; i < ele.length; i++) {
			
			if(larg < ele[i]) {
				larg = ele[i];
			}
		}
		
		System.out.println("Largest element in array: "+larg);
		

	}

}
