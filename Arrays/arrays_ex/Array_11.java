package arrays_ex;

//Reverse the array without using another array.

public class Array_11 {

	public static void main(String[] args) {
		
		int [] num = {34,56,88,99,13,56,78,54};
		
		int start = 0;
		int end = num.length-1;
		
		
		
		while(start < end) {
			int temp = num[start];
			num[start] = num[end];
			num[end] = temp;
			
			start++;
			end--;
		}
		
		for(int i = 0; i < num.length;i++) {
			System.out.print(num[i]+" ");
		}
		
	}

}
