package arrayList_ex;

import java.util.ArrayList;

// Remove an element by index from an ArrayList.

public class ArrayList_8 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(345);
		arr.add(65);
		arr.add(23);
		arr.add(98);
		arr.add(11);
		arr.add(35);
		
		System.out.println("Elements: "+arr);
		
		System.out.println("Removed element at index 3: "+arr.remove(3));
		
		System.out.println("new elements: "+arr);
		
		
		

	}

}
