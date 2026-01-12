package linkedList_ex;

import java.util.LinkedList;

// Remove all elements from a LinkedList

public class LinkedList_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> temp = new LinkedList<>();
		
		temp.add(23);
		temp.add(78);
		temp.add(90);
		temp.add(12);
		temp.add(78);
		
		System.out.println("Elements: "+temp);
		
		temp.clear();
		
		System.out.println("Elements: "+temp);

	}

}
