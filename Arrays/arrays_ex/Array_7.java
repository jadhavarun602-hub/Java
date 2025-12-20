package arrays_ex;

//Search for a given element and print its index (linear search).

public class Array_7 {

	public static void main(String[] args) {
		
		int [] arr = {33,12,65,87,54,33,66,78};
		int target = 54;
		
		for(int i = 0; i < arr.length; i++) {
			if(target == arr[i]) {
				System.out.println("given element index of: "+i);
			}
		}

	}

}
