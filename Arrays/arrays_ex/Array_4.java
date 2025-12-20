package arrays_ex;

import java.util.Scanner;

//Read n elements into an array and display them using a loop.

public class Array_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		
		for(int i = 0; i < size; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Array elements..");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();

	}

}
