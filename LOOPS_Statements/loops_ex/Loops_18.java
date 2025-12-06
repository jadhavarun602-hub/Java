package loops_ex;

import java.util.Scanner;

// Check if a number is prime using a loop.

public class Loops_18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Num : ");
		int num = sc.nextInt();
		
		if(num <= 1) {
		
			return;
			}
		
		boolean isPrime = true;
		
		for(int i = 2; i < num /2; i++) 
		{
			
			if(num % i == 0) 
			{
				isPrime = false;
				break;
			}
		}
		
		
		
		if(isPrime)
		{
			System.out.println(num + " Is a prime Number");
		}else 
		{
			System.out.println(num + " Is a not Prime Number");
		}
		
	}

}
