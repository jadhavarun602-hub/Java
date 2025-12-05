package loops_ex;

import java.util.Scanner;

// Find the GCD (Greatest Common Divisor) of two numbers using loops

public class Loops_15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter First No. : ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter Second No. : ");
		int num2 = sc.nextInt();
		
		
		int gcd = 1;
		
		int min = (num1 < num2 ) ? num1 : num2 ;
		
		for(int i = 1; i <= min; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				gcd = i;
			}
		}
		
		System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);

	}

}
