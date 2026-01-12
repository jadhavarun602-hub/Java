package linkedList_ex;

import java.util.LinkedList;

// Remove the last element from a LinkedList.

public class LinkedList_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> a = new LinkedList<>();
		
		a.add(53);
		a.add(23);
		a.add(90);
		a.add(86);
		a.add(22);
		a.add(12);
		
		System.out.println("Before ele: "+a);
		
		a.removeLast();
		
		System.out.println("Remove Last: "+a);
		

	}

}
