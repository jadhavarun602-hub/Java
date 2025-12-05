package loops_ex;

import java.util.Scanner;

// Check if a number is a palindrome using a loop (e.g., 121 → Palindrome).

public class Loops_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Num : ");
		int num = sc.nextInt();
		
		int temp = num;
		
		int demo = 0;
		
		while(temp > 0) {
			
			int digit = temp % 10;
			 demo = demo * 10 +digit;
			 temp = temp / 10;
			
		}
		

		
		if(num == demo) {
			System.out.println("This is a palindrome");
		}else {
			System.out.println("This is Not palindome");
		}

	}

}
