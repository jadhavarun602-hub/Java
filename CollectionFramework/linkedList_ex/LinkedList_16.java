package linkedList_ex;

import java.util.LinkedList;

// Check whether a specific element exists in a LinkedList.

public class LinkedList_16 {

	public static void main(String[] args) {
		
		LinkedList<Integer> temp = new LinkedList<>();
		
		temp.add(78);
		temp.add(12);
		temp.add(89);
		temp.add(56);
		temp.add(34);
		temp.add(43);
		temp.add(66);
		
		System.out.println("Ele: "+temp);
		
		if(temp.contains(89)) {
			System.out.println("89 exists in LinkedList");
		}else {
			System.out.println("89 not exists in LinkedList");
		}
		

	}

}
