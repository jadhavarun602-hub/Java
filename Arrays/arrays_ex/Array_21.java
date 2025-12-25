package arrays_ex;

//Find the difference between largest and smallest elements

public class Array_21 {

	public static void main(String[] args) {
		
		int [] ele = {21,45,66,21,4,55,31,78,12};
		
		int largest = ele[0];
		int smallest = ele[0];
		
		for(int i = 0; i < ele.length; i++) {
			
			if(ele[i] > largest) {
				largest = ele[i];
			}
			
			
			if(ele[i] < smallest) {
				smallest = ele[i];
			}
		}
		
		int diff = largest - smallest;
		
		System.out.println("Largest value: "+largest);
		System.out.println("Smallest value: "+smallest);
		System.out.println("difference is: "+diff);

	}

}
