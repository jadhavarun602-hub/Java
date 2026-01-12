package linkedList_ex;

import java.util.ArrayList;
import java.util.LinkedList;

// Convert a LinkedList into an ArrayList.

public class LinkedList_24 {

	public static void main(String[] args) {
		
		LinkedList<Integer> li = new LinkedList<>();
		
		li.add(456);
		li.add(454);
		li.add(890);
		li.add(234);
		li.add(341);
		
		ArrayList<Integer> arr = new ArrayList<>(li);
		
//		arr.addAll(li);
		
		System.out.println(arr);
		

	}

}
