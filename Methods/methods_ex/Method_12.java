package methods_ex;

import java.util.Scanner;

//Write a method to sum the digits of a number.

public class Method_12 {
	
	public static void sumDigit(int n) {
		
		int sum = 0;
		
		
		while(n > 0) {
			
			int digit = n % 10;
			sum += digit;
			n = n / 10;
		}
		
		System.out.println("sum of digits: "+sum);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Num: ");
		int num = sc.nextInt();
		
		sumDigit(num);
		
		sc.close();
	}

}
