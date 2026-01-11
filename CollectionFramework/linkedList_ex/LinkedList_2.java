package linkedList_ex;

import java.util.LinkedList;

// Create a LinkedList<String> and print all elements.

public class LinkedList_2 {

	public static void main(String[] args) {
		
		LinkedList<String> location = new LinkedList<>();
		
		location.add("Pune");
		location.add("Mumbai");
		location.add("Dharashiv");
		location.add("Satara");
		location.add("Bangalore");
		
		System.out.println("Locations: "+location);

	}

}
