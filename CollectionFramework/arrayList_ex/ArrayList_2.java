package arrayList_ex;

import java.util.ArrayList;

// Create an ArrayList<String> and print all elements using a loop.

public class ArrayList_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Arun");
		names.add("Tushar");
		names.add("Vishal");
		names.add("Uday");
		names.add("Pranav");
		
//		System.out.println(name);
		
		
		for(String name : names) {
			System.out.println("Names: "+name);
		}

	}

}
