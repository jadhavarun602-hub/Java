package arrays_ex;

//Find the average of elements in an array.

public class Array_3 {

	public static void main(String[] args) {
		
		int [] element = {12,53,77,90,45,32,87,30,12};
		
		int sum = 0;
		
		for(int i = 0; i < element.length; i++) {
			 sum += element[i];
		}
		
		double average = (double)sum / element.length;
		
		System.out.println("average of element: "+average);

	}

}
