package string_ex;

import java.util.Scanner;

// Convert a string to uppercase and lowercase.

public class String_3 {
	
	public static void converUpAndLow(String str) {
		
		if(str.equals(str.toLowerCase())) {
			System.out.println("UpperCase: "+str.toUpperCase());
		}else {
			System.out.println("LowerCase: "+str.toLowerCase());
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a String: ");
		String msg = sc.nextLine();
		
		converUpAndLow(msg);
		
		sc.close();

	}

}
