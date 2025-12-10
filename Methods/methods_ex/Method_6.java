package methods_ex;

import java.util.Scanner;

// Write a method to find the largest of two numbers.

public class Method_6 {
	
	public static void findLargNum(int a , int b) {
		
		if(a > b) {
			 System.out.println(a + " is greater than " + b);
		}else if(b > a) {
			System.out.println(b + " is greater than " + a);
		}else {
			System.out.println(a + " and " + b + " are equal numbers");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st num: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter 2nd num: ");
		int num2 = sc.nextInt();
		
		findLargNum(num1,num2);
		
		sc.close();

	}

}
