package methods_ex;

import java.util.Scanner;

// Write a method to find the square of a number.

public class Method_2 {
	
	public static int squareNum(int n) {
		
		return n*n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num: ");
		int num = sc.nextInt();
		
		int square = squareNum(num);
		
		System.out.println("Square of " + num + " is: " + square);
		
		sc.close();

	}

}
