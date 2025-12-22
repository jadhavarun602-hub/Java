package arrays_ex;

//Count the frequency of a given element in an array.

public class Array_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {23,45,21,67,99,75,67,94,37,86,15};
		
		int target = 67;
		int countFrq = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == target) {
				countFrq++;
			}
		}
		
		System.out.println("Frequency of element: "+countFrq);

	}

}
