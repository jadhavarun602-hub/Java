package methods_ex;

import java.util.Scanner;

//Write a method to print multiplication table of a given number.

public class Method_13 {
	
	public static void printTable(int n) {
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.println(n+" X "+i+" = "+(n*i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Table Num: ");
		int num = sc.nextInt();
		
		printTable(num);
		
		sc.close();

	}

}
