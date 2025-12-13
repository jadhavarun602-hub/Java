package methods_ex;

import java.util.Scanner;

//Write a static method to check whether a year is a leap year.

public class Method_22 {
	
	public static void checkYear(int year) {
		
		if((year % 400 == 0)||(year % 4 == 0 && year % 100 != 0)) {
			System.out.println(year+" is leap year...");
		}else {
			System.out.println(year+" is not a leap year...");
		}
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Year: ");
		int year = sc.nextInt();
		
		checkYear(year);
		
		sc.close();
		
	}

}
