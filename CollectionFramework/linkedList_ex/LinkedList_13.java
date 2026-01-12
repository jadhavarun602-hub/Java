package linkedList_ex;

import java.util.LinkedList;

// Remove an element by index from a LinkedList.

public class LinkedList_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> e = new LinkedList<>();
		
		e.add(456);
		e.add(23);
		e.add(789);
		e.add(5678);
		e.add(345);
		e.add(123);
		e.add(900);
		
		System.out.println("Before Ele: "+e);
		
		System.out.println("Remove index ele: "+e.remove(4));
		
		System.out.println("After ele: "+e);

	}

}
