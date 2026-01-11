package linkedList_ex;

import java.util.LinkedList;
import java.util.Scanner;

// Add elements to a LinkedList using user input.

public class LinkedList_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Size: ");
		int size = sc.nextInt();
		
		LinkedList<Integer> num = new LinkedList<>();
		
		System.out.println("Enter a Num's: ");
		
		for(int i = 0; i < size; i++) {
			int temp = sc.nextInt();
			num.add(temp);
			
		}
		
//		System.out.println("User elements: "+num);
		
		for(int a : num) {
			System.out.println(a);
		}
	}

}
