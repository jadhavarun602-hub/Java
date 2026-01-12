package linkedList_ex;

import java.util.LinkedList;

// Add an element at the end of a LinkedList.

public class LinkedList_7 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(78);
		list.add(23);
		list.add(90);
		list.add(45);
		
		System.out.println("Before adding: " + list);
		
		list.addLast(87);
		
		System.out.println("After adding: " + list);

	}

}
