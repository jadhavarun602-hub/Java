package recu_ex;

// Write a recursive method to find the sum of first n natural numbers.

public class Recursion_3 {
	
	public static void sumNatural(int num) {
		
		int sum = 0;
		
		if(num == 0) {
			sum += num;
			return;
		}
		
		
		sumNatural(num-1);
		
		System.out.println("Sum of Natural num: "+sum);
	}

	public static void main(String[] args) {
		
		int n = 10;
		
		sumNatural(n);

	}

}
