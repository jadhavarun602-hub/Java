package arrays_ex;

//Find the missing number in an array of size n-1 containing numbers from 1 to n.

public class Array_23 {
	
	public static void findMissingNum(int []arr) {
		
		 int n = arr.length + 1;

	        int totalSum = n * (n + 1) / 2;
	        int arraySum = 0;

	        for (int num : arr) {
	            arraySum += num;
	        }

	        int missing = totalSum - arraySum;
	        System.out.println("Missing Number: " + missing);
	    }

	public static void main(String[] args) {
		
		int [] array = {1,2,3,4,6,7,8,9};
		
		findMissingNum(array);

	}

}
