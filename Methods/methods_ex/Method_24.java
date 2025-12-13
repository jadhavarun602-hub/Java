package methods_ex;

import java.util.Scanner;

//Write a recursive method to find factorial of a number.

public class Method_24 {
	
	public static int findFactorial(int n) {
		
		if(n == 0 || n == 1) {
			return 1;
		}
		
		return n*findFactorial(n-1);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Num: ");
		int num = sc.nextInt();
		
		int Factorial = findFactorial(num);
		
		System.out.println("Factorial is : "+Factorial);

	}

}
