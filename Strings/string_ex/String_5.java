package string_ex;

import java.util.Scanner;

// Concatenate two strings without using + operator.

public class String_5 {
	
	public static void concatenate(String str1, String str2) {
		
		System.out.println(str1.concat(" "+str2));
	}

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string 1st: ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter string 2nd: ");
		String str2 = sc.nextLine();
		
		concatenate(str1,str2);
		
		sc.close();
	}

}
