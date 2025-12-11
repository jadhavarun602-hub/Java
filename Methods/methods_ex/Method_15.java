package methods_ex;

import java.util.Scanner;

//Write a method to check whether a number is palindrome.

public class Method_15 {
	
	public static void checkPalindrome(int num) {
		
		int OriginalNum = num;
		int temp = 0;
		
		while(num > 0) {
			int digit = num % 10;
			temp = temp * 10 + digit;
			num = num / 10;
		}
		
		if(OriginalNum == temp) {
			System.out.println(OriginalNum+" is Palindrome number");
		}else {
			System.out.println(OriginalNum+" is Not a Palindrome number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		
		checkPalindrome(num);
		
		
		sc.close();

	}

}
