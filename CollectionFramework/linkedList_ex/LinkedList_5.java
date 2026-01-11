package linkedList_ex;

import java.util.LinkedList;

// Access elements from a LinkedList using index.

public class LinkedList_5 {

	public static void main(String[] args) {
		
		LinkedList<Integer> ele = new LinkedList<>();
		
		ele.add(45);
		ele.add(90);
		ele.add(12);
		ele.add(56);
		ele.add(34);
		ele.add(78);
		ele.add(55);
		
		System.out.println("Elements at index 4:: "+ele.get(4));

	}

}
