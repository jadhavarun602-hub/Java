package linkedList_ex;

import java.util.LinkedList;

// Remove the first element from a LinkedList.

public class LinkedList_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> arr = new LinkedList<>();
		
		arr.add(45);
		arr.add(12);
		arr.add(90);
		arr.add(78);
		arr.add(93);
		arr.add(23);
		
		System.out.println("Before Elements: "+arr);
		
		arr.removeFirst();
		
		System.out.println("After remove: "+arr);

	}

}
