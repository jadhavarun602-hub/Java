package string_ex;

import java.util.Scanner;

// Check whether a string is a palindrome.

public class String_12 {
	
	public static void checkPalindrome(String str) {
		
		String rev = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
			
			rev += str.charAt(i);
			
		}
		
		if (rev.equals(str)) {
            System.out.println("This is a palindrome string");
        } else {
            System.out.println("This is not a palindrome string");
        }
	}

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter String: ");
		
		String str = sc.nextLine();
		
		checkPalindrome(str);
		
		sc.close();
		
	}

}
