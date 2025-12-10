package methods_ex;

import java.util.Scanner;

// Write a method to convert temperature from Celsius to Fahrenheit.

public class Method_5 {
	
	public static double convertTemp(double c) {
		
		
		return c * 1.8 + 32;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Enter Celsius: ");
		double num = sc.nextDouble();
		
		System.out.println("Fahrenheit : "+convertTemp(num));
		
		sc.close();
	}
}
