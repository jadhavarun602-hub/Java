package arrayList_ex;

import java.util.ArrayList;
import java.util.Scanner;

// Add elements to an ArrayList at runtime using user input.

public class ArrayList_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter element Size: ");
		
		int size = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		System.out.println("Enter elements: ");
		
		for(int i = 0; i < size;i++) {
			arr.add(sc.nextInt());
		}
		
		System.out.print("Elements: "+arr);
		
	}

}
