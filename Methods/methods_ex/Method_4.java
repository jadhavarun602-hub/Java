package methods_ex;

import java.util.Scanner;

// Write a method that takes a number and returns the factorial.

public class Method_4 {

	public static int factorial(int n) {
		
		int temp = 1;
		
		for(int i = 1; i <= n ;i++) {
			
			temp *= i;
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num: ");
		int num = sc.nextInt();
		
		if(num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + num + " is: " + factorial(num));
        }

        sc.close();

	}

}
