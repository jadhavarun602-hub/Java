package loops_ex;

import java.util.Scanner;

//Print a right-aligned triangle.

public class Loops_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number: ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			
			for(int j = num; j > i; j--) {
				System.out.print(" ");
			}
			
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
