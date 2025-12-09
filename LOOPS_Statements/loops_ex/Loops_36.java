package loops_ex;

import java.util.Scanner;

//Print repeated alphabet series.

public class Loops_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enetr num: ");
		int num = sc.nextInt();
		
		for(int i = 0; i <= num; i++) {
			
			char ch = (char) ('A' + i);
			
			for(int j = 0; j <= i; j++) {
				System.out.print(ch);
			}
			
			System.out.println();
		}
	}

}
