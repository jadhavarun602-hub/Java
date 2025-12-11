package methods_ex;

import java.util.Scanner;

//Write a method to count the digits of a number.

public class Method_11 {
	
	public static void countDigit(int n) {
		
		int count = 0;
		n = Math.abs(n);
		
		while(n > 0) {
			
			n = n / 10;
			count++;
		}
		
		System.out.println("count the digits of a number: "+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tm = new Scanner(System.in);
		
		System.out.print("Enter a Num: ");
		int num = tm.nextInt();
		
		countDigit(num);
		
		tm.close();
	}

}
