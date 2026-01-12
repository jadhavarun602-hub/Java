package linkedList_ex;

import java.util.LinkedList;

// Add an element at the beginning of a LinkedList.

public class LinkedList_6 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(45);
		list.add(23);
		list.add(90);
		list.add(13);
		list.add(37);
		
		System.out.println("Before adding: " + list);
		list.addFirst(88);
		System.out.println("After adding: " + list);
		

	}

}
