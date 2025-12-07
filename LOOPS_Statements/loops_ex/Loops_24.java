package loops_ex;

import java.util.Scanner;

// Print a pyramid pattern.

public class Loops_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner cd = new Scanner(System.in);
		
		System.out.print("Enter a Num: ");
		int num = cd.nextInt();
		
		for(int i = 1; i <= num; i++) {
			
		    for(int k = num; k > i; k--) {
		    	System.out.print(" ");
		    }
			
			for(int j = 1; j <= i*2-1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
