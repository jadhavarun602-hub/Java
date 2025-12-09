package loops_ex;

import java.util.Scanner;

// Print an inverted number triangle.

public class Loops_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number: ");
		int num = sc.nextInt();
		
		for(int i = num; i >= 1; i--) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}

	}

}
