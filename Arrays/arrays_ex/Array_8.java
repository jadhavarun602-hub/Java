package arrays_ex;

import java.util.Scanner;

//Count how many even and odd numbers are in an array.

public class Array_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Size : ");
		int size = sc.nextInt();
		
		int [] arr = new int [size];
		
		for(int i = 0; i < size; i++) {
			System.out.print("Enter element " + (i + 1) + ": ");
			arr[i] = sc.nextInt();
		}
		
		int EvenCount = 0;
		int OddCount = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.println(arr[i]);
				EvenCount++;
				
			}else {
				System.out.println(arr[i]);
				OddCount++;
			}
		}
		
		System.out.println("Even no count: "+EvenCount);
		System.out.println("Odd no count: "+OddCount);
		
		sc.close();

	}

}
