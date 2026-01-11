package linkedList_ex;

import java.util.LinkedList;

// Find the size of a LinkedList.

public class LinkedList_4 {

	public static void main(String[] args) {
		
		LinkedList<Integer> arr = new LinkedList<>();
		
		arr.add(45);
		arr.add(12);
		arr.add(90);
		arr.add(56);
		arr.add(34);
		arr.add(78);
		
		System.out.println("Elements: "+arr);
		
		System.out.println("LinkedList Size: "+arr.size());

	}

}
