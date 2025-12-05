package loops_ex;

import java.util.Scanner;

// Count the number of digits in a number using a loop.

public class Loops_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Num: ");
		int num = sc.nextInt();
		
		int count = 0;
		
		while(num != 0) {
			num = num / 10;
			count++;
		}
		
		System.out.println("Number of count is: "+count);

	}

}
