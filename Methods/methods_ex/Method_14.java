package methods_ex;

import java.util.Scanner;

//Write a method to print Fibonacci series up to n terms.

public class Method_14 {
	
	public static void fibonacci(int n) {
		
		int a = 0;
		int b = 1;
		
		if(n >= 1)
			System.out.print(a);
		if(n >= 2)
			System.out.print("," + b);
		
		for(int i = 3; i <= n; i++) {
			
			int c = a+b;
			System.out.print(","+c);
			a = b;
			b = c;
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Table Num: ");
		int num = sc.nextInt();
		
		fibonacci(num);
		
		sc.close();
	}

}
