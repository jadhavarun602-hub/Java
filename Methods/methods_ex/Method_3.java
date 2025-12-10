package methods_ex;

import java.util.Scanner;

// Write a method to check whether a number is even or odd.

public class Method_3 {
	
	public static void checkEvenOdd(int n) {
		
		if(n % 2 == 0) {
			System.out.println(n+" is Even number");
		}else {
			System.out.println(n+" is Odd number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a num: ");
		int num = sc.nextInt();
		
		checkEvenOdd(num);
		
		sc.close();
	}

}
