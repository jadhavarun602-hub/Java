package methods_ex;

import java.util.Scanner;

//Create an overloaded method display() that prints:
//an integer
//a double
//a string

public class Method_18 {
	
	public static void display(int n) {
		
		System.out.println("Integer: "+n);
		
	}
	
	public static void display(double n) {
		
		System.out.println("Double: "+n);
	}
	
	public static void display(String n) {
		
		System.out.println("String: "+n);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a num: ");
		int n = sc.nextInt();
		
		System.out.print("Enter a num: ");
		double num = sc.nextDouble();
		
		System.out.print("Enter a Name: ");
		String name = sc.next();
		
		display(n);
		display(num);
		display(name);
		

	}

}
