package loops_ex;

// Reverse a given number using a loop (e.g., 123 → 321).

public class Loops_9 {

	public static void main(String[] args) {
		
		int num = 6539;
		int rev = 0;
		
		while(num > 0) {
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
			
		}
		
		System.out.println(rev);

	}

}
