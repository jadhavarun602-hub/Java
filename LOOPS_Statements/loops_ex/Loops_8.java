package loops_ex;

import java.util.Scanner;

// Calculate the factorial of a given number using a loop.

public class Loops_8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num: ");
		int num = sc.nextInt();
		
		int factorial = 1;
		
		for(int i = 1; i <= num; i++) {
			
			factorial *= i;
		}

		System.out.println("Factorial : "+factorial);
	}

}
