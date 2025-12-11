package methods_ex;

import java.util.Scanner;

//Write a method to find the largest of three numbers.

public class Method_7 {

	public static void findLargThree(int a, int b, int c) {

		if (a > b && a > c) {
			
			System.out.println(a + " is greater than " + b + " and " + c);
			
		} else if (b > a && b > c) {
			
			System.out.println(b + " is greater than " + a + " and " + c);
			
		} else if (c > a && c > b) {
			
			System.out.println(c + " is greater than " + a + " and " + b);
			
		} else {
			
			System.out.println(a + " and " + b + " and " + c + " are same number");
			
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter 1st num: ");
		int num1 = sc.nextInt();

		System.out.print("Enter 2nd num: ");
		int num2 = sc.nextInt();

		System.out.print("Enter 3rd num : ");
		int num3 = sc.nextInt();

		findLargThree(num1, num2, num3);

		sc.close();

	}

}
