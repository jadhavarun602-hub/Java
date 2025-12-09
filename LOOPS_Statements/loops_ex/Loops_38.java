package loops_ex;

import java.util.Scanner;

// Print alphabet square.

public class Loops_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a num: ");
		int num = sc.nextInt();
		
		for(int i = 0; i < num; i++) {
			
			char ch = (char)('A'+i);
			
			for(int j = 0; j < num; j++) {
				System.out.print(ch);
			}
			
			System.out.println();
		}

	}

}
