package linkedList_ex;

import java.util.LinkedList;

// Check whether a LinkedList is empty or not.

public class LinkedList_19 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(678);
		list.add(345);
		list.add(231);
		list.add(998);
		
		System.out.println(list);
		
		if(list.isEmpty()) {
			System.out.println("LinkedList is Empty..");
		}else {
			System.out.println("LinkedList is Not Empty");
		}

	}

}
