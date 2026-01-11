package linkedList_ex;

import java.util.LinkedList;

// Create a LinkedList and add integer elements to it.

public class LinkedList_1 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(34);
		list.add(79);
		list.add(90);
		list.add(23);
		list.add(11);
		
		System.out.println("LinkedList elements: "+list);

	}

}
