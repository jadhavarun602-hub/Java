package loops_ex;

import java.util.Scanner;

// Print repeating row numbers.

public class Loops_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number: ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			
			System.out.println();
		}

	}

}
