package linkedList_ex;

import java.util.LinkedList;

// Compare two LinkedLists for equality.

public class LinkedList_20 {

	public static void main(String[] args) {
		
		LinkedList<Integer> a = new LinkedList<>();
		
		a.add(678);
		a.add(890);
		a.add(123);
		
		LinkedList<Integer> b = new LinkedList<>();
		
		b.add(456);
		b.add(432);
		b.add(987);
		
//		b.add(678);
//		b.add(890);
//		b.add(123);
		
		System.out.println(a.equals(b));
		

	}

}
