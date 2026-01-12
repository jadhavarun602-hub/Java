package linkedList_ex;

import java.util.LinkedList;

// Find the first occurrence of an element in a LinkedList.

public class LinkedList_17 {

	public static void main(String[] args) {
		
		LinkedList<Integer> p = new LinkedList<>();
		
		p.add(43);
		p.add(12);
		p.add(56);
		p.add(87);
		p.add(234);
		p.add(56);
		p.add(34);
		
		int ele = 56;
		
		int index = p.indexOf(ele);
		
		if(index != -1) {
			System.out.println("First occurrence of " + ele + " is at index: " + index);
		}else {
			System.out.println("element not exist in LinkedList");
		}
		
		
	}

}
