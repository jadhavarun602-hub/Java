package methods_ex;

import java.util.Scanner;

//Write a method to return the reverse of a number.

public class Method_10 {
	
	public static int reverseNum(int n) {
		
		int rev = 0;
		
		while(n > 0) {
			int digit = n % 10;
			rev = rev * 10 + digit;
			n = n / 10;
			
		}
		
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a numbers: ");
		int num = sc.nextInt();
		
		int reverse = reverseNum(num);
		
		System.out.println("Original num: "+num);
		System.out.println("Reverse Num: "+reverse);
		
		sc.close();

	}

}
