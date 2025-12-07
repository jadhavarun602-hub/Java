package loops_ex;

import java.util.Scanner;

// 	write a given number factorial

public class Loops_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter a Num: ");
		
		int num = sc.nextInt();
		
		int fact = 1;
		
		if(num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }
		
		for(int i = 1; i <= num; i++) {
			
			fact *= i;
			
		}
		
		System.out.println("Given number Factorial is: "+fact);

	}

}
