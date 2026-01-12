package linkedList_ex;

import java.util.LinkedList;

// Add an element at a specific position in a LinkedList.

public class LinkedList_8 {

	public static void main(String[] args) {
		
		LinkedList<Integer> ele = new LinkedList<>();
		
		ele.add(89);
		ele.add(23);
		ele.add(12);
		ele.add(67);
		ele.add(34);
		
		System.out.println("Before adding: "+ele);
		
		ele.add(2, 77);
		
		System.out.println("After adding: "+ele);

	}

}
