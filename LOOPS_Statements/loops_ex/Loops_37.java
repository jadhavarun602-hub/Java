package loops_ex;

import java.util.Scanner;

// Print continuous alphabet sequence.

public class Loops_37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enetr num: ");
		int num = sc.nextInt();
		
		char count = 'A';
		
		for(int i = 1; i < num; i++) {
			
			
			for(int j = 0; j < i; j++) {
				System.out.print(count);
				count++;
			}
			System.out.println();
			
		}

	}

}
