package methods_ex;

import java.util.Scanner;

// Write a method to add two numbers and return the sum.


public class Method_1 {
	
	public static int addTwoNum(int a, int b) {
		 
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 1st Num: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter 2nd Num: ");
		int num2 = sc.nextInt();
		
		int sum = addTwoNum(num1,num2);
		System.out.println("Sum : "+sum);

	}

}
