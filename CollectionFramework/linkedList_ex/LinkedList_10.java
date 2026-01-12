package linkedList_ex;

import java.util.LinkedList;

// Add duplicate elements to a LinkedList and display them.

public class LinkedList_10 {

	public static void main(String[] args) {
		
		LinkedList<Integer> ele = new LinkedList<>();
		
		ele.add(78);
		ele.add(56);
		ele.add(78);
		ele.add(12);
		ele.add(56);
		ele.add(45);
		ele.add(12);
		ele.add(90);
		
		System.out.println("Original ele: "+ele);
		
		System.out.println("Duplicate elements: ");
		
		for(int i = 0; i < ele.size(); i++) {
			for(int j = i+1;j < ele.size(); j++) {
				if(ele.get(i).equals(ele.get(j))) {
					System.out.println(ele.get(i));
				}
			}
		}

	}

}
