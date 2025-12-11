package methods_ex;

import java.util.Scanner;

// Create overloaded methods add() to:

//add two integers
//add three integers
//add two double values

public class Method_16 {
	
	public static int add(int a, int b) {
		
		return a + b;
	}
	
	public static int add(int a,int b,int c) {
		
		return a + b + c ;
	}
	
	public static double add(double a, double b) {
		
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scc = new Scanner(System.in);
		
		System.out.print("Enter 1st num: ");
		int n1 = scc.nextInt();
		
		System.out.print("Enter 2nd num: ");
		int n2 = scc.nextInt();
		
		System.out.print("Enter 3rd num: ");
		int n3 = scc.nextInt();
		
		
		System.out.println("Add two integers: " + add(n1, n2));
		System.out.println("Add three integers: " + add(n1, n2, n3));
		System.out.println("Add two doubles: " + add((double)n1, (double)n2));
		
	

	}

}
