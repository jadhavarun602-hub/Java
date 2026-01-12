package linkedList_ex;

import java.util.Collection;
import java.util.LinkedList;

// Add multiple elements from another collection to a LinkedList.

public class LinkedList_9 {

	public static void main(String[] args) {
		
		Collection<Integer> ele = new LinkedList<>();
		
		ele.add(23);
		ele.add(12);
		ele.add(90);
		ele.add(67);
		ele.add(34);
		
		System.out.println("First elements: "+ele);
		
	    LinkedList<Integer> temp = new LinkedList<>();
	    
	    System.out.println("Before elements: "+temp);
	    
	    temp.addAll(ele);
	    
	    System.out.println("After elements: "+temp);

	}

}
