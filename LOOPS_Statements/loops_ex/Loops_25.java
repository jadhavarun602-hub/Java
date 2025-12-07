package loops_ex;

import java.util.Scanner;

// Print an inverted pyramid.

public class Loops_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Num: ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			
			for(int j = 1; j < i; j++) {
				System.out.print(" ");
		     }
			
			for(int k = (2 * num) - (2 * i - 1); k >= 1; k--) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
