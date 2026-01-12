package linkedList_ex;

import java.util.LinkedList;
import java.util.ListIterator;

// Traverse a LinkedList in reverse order.

public class LinkedList_23 {

	public static void main(String[] args) {
		
		LinkedList<Integer> p = new LinkedList<>();
		
		p.add(89);
		p.add(67);
		p.add(23);
		p.add(45);
		p.add(90);
		p.add(44);
		p.add(12);
		
		ListIterator<Integer> li = p.listIterator(p.size());
		
		while(li.hasPrevious()) {
			System.out.println(li.previous());
			
		}

	}

}
