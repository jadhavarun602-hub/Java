package loops_ex;

import java.util.Scanner;

//Print hollow triangle pattern.

public class Loops_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num : ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			
			for(int j = 1; j <= i*2-1; j++) {
				
				if(j == 1 || j == i*2-1 || i == n) {
				    System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
