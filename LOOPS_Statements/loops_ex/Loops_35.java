package loops_ex;

import java.util.Scanner;

// Print alphabet increasing pattern.

public class Loops_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a num: ");
		
		int num = sc.nextInt();
		
		for(int i = 1 ; i <= num; i++) {
			
			for(char j = 'A'; j <= 'A'+ i;j++) {
				
				System.out.print(j);
			}
			
			System.out.println();
		}
		
		

	}

}
