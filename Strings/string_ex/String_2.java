package string_ex;

import java.util.Scanner;

// Read a string from user input and display it.

public class String_2 {
	
	public static void display(String str) {
		
		System.out.println(str);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter input string: ");
		String string = sc.nextLine();
		
		display(string);

	}

}
