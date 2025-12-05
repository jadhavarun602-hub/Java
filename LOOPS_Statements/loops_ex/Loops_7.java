package loops_ex;

// Calculate the sum of all odd numbers from 1 to 100 using a loop.

public class Loops_7 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			
			if(i % 2 != 0) {
				sum += i;
			}
		}
		
		System.out.println("sum of all odd numbers: "+sum);

	}

}
