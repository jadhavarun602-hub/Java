package loops_ex;

import java.util.Scanner;

// Print the multiplication table of a given number using a loop.

public class Loops_14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Table Num: ");
		
		int num = sc.nextInt();
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.println(num+" X "+i+" = "+(i*num));
		}
		
	}

}
