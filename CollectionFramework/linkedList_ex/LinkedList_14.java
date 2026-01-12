package linkedList_ex;

import java.util.LinkedList;

// Remove an element by value from a LinkedList

public class LinkedList_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> ele = new LinkedList<>();
		
		ele.add(23);
		ele.add(89);
		ele.add(12);
		ele.add(456);
		ele.add(90);
		ele.add(56);
		
		System.out.println("Before ele: "+ele);
		
		ele.remove(Integer.valueOf(12));
		
		System.out.println("After ele: "+ele);
		
	}

}
