package linkedList_ex;

import java.util.LinkedList;
import java.util.ListIterator;

// Traverse a LinkedList using ListIterator.

public class LinkedList_22 {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(67);
		list.add(45);
		list.add(34);
		list.add(90);
		list.add(87);
		list.add(56);
		
		ListIterator<Integer> li = list.listIterator();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}

	}

}
