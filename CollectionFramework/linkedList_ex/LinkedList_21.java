package linkedList_ex;

import java.util.Iterator;
import java.util.LinkedList;

// Traverse a LinkedList using Iterator.

public class LinkedList_21 {

	public static void main(String[] args) {
		
		LinkedList<Integer> r = new LinkedList<>();
		
		r.add(567);
		r.add(345);
		r.add(89);
		r.add(12);
		r.add(90);
		r.add(34);
		
		Iterator<Integer> it = r.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
