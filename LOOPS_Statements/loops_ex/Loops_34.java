package loops_ex;

import java.util.Scanner;

// Print Floyd’s Triangle.

public class Loops_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Num: ");
		int num = sc.nextInt();
		
		int count = 1;
		
		for(int i = 1; i <= num; i++) {
			
			for(int j = 1; j <= i; j++) {
				System.out.print(" "+count);
				count++;
			}
			System.out.println();
		}
	}

}
