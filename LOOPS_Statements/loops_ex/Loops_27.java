package loops_ex;

import java.util.Scanner;

//Print a diamond shape.


public class Loops_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Num: ");
		int num = sc.nextInt();
		
		
//		Up
		
		for(int i = 1; i <= num; i++) {
			
			for(int j = num; j > i; j--) {
				System.out.print(" ");
			}
			
			for(int k = 1; k <= i*2-1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
//		Down
		
		
		for(int i = num -1; i >= 1; i--) {
			
			for(int j = num; j > i; j--) {
				System.out.print(" ");
			}
			
			for(int k = 1; k <= i*2-1; k++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
