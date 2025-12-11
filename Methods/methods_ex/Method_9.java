package methods_ex;

import java.util.Scanner;

// Write a method to check if a number is prime and return true/false.

public class Method_9 {
	
	public static boolean checkPrime(int n) {
		
		
		if(n <= 1) {
			System.out.println("Enter a Valid Number..!");
			
			return false;
		}
		
		for(int i = 2; i < n; i++ ) {
			if(n % i == 0) {
				
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Num: ");
		int num = sc.nextInt();
		
		boolean result = checkPrime(num);
		
		if(result) {
			System.out.println(num+" is Prime Number..");
		}else {
			System.out.println(num+" is Not a Prime Number");
		}
		
		sc.close();

	}

}
