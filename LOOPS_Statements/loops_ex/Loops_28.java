package loops_ex;

import java.util.Scanner;

// Print a hollow diamond.

public class Loops_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number: ");
		int num = sc.nextInt();

//		Upper

		for (int i = 1; i <= num; i++) {

			for (int j = 1; j <= num - i ; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= 2*i-1; k++) {

				if (k == 1 || k == 2*i-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

//		Lower

		for (int i = num-1; i >= 1; i--) {

			for (int j = 1; j <= num-i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= 2*i-1; k++) {

				if (k == 1 || k == 2*i-1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}

	}

}
