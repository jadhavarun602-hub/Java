package loops_ex;

// Calculate the sum of first 50 natural numbers using a loop.

public class Loops_5 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i <= 50; i++) {
			
			sum += i;
		}
		
		System.out.println("Sum of : "+sum);
	}

}
