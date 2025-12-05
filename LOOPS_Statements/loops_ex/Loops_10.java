package loops_ex;

import java.util.Scanner;

// Find the sum of digits of a number using a loop.

public class Loops_10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Num: ");
		int num = sc.nextInt();
		
		int sum = 0;
		
		while(num > 0) {
			int digit = num % 10;
			sum = sum + digit;
			num = num / 10;
		}
		
		System.out.println("Sum of Digit: "+sum);

	}

}
