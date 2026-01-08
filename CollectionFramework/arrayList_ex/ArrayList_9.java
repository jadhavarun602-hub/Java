package arrayList_ex;

import java.util.ArrayList;

// Remove an element by value from an ArrayList.

public class ArrayList_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> elements = new ArrayList<>();
		
		elements.add(12);
		elements.add(23);
		elements.add(34);
		elements.add(45);
		elements.add(56);
		elements.add(67);
		
		System.out.println("Elements: "+elements);
		
		elements.remove(Integer.valueOf(34));
		
		System.out.println("new Elements: "+elements);
	}

}
