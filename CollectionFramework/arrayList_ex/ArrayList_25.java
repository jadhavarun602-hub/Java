package arrayList_ex;

import java.util.ArrayList;

// Convert an ArrayList to an array and print the array.

public class ArrayList_25 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(23);
		list.add(56);
		list.add(12);
		list.add(90);
		list.add(78);
		list.add(45);
		list.add(34);
		list.add(10);
		
		System.out.println(list);
		
		System.out.println("Array Elements..");
		Integer[] arr = list.toArray(new Integer[0]);
		
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

}
