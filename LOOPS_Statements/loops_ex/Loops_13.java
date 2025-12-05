package loops_ex;

import java.util.Scanner;

// Check if a number is an Armstrong number using a loop (e.g., 153 → Armstrong).

public class Loops_13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		
		int num = sc.nextInt();
		
		int originalNum = num;
		
		int temp = 0;
		
		while(num > 0) {
			int digit = num % 10;
			temp = temp + (digit * digit * digit);
			num = num / 10;
		}

//		System.out.println(temp);
		
		if(temp == originalNum) {
			System.out.println("This is Armstrong number");
		}else {
			System.out.println("This is Not a Armstrong number");
		}
	}

}
