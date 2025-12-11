package methods_ex;

import java.util.Scanner;

// Write a method to calculate the simple interest.

public class Method_8 {
	
	public static int calculateSiInterest(int p, int r,int t) {
		
		int SI = (p * r * t)/100;
		
		return SI;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Principle Amount: ");
		int P = sc.nextInt();
		
		System.out.print("Enter Rate (%): ");
		int R = sc.nextInt();
		
		System.out.print("Enter Time (years): ");
		int T = sc.nextInt();
		
		int SimpleInterest = calculateSiInterest(P,R,T);
		
		System.out.println("Simple Interest is: "+SimpleInterest);
		
		sc.close();

	}

}
