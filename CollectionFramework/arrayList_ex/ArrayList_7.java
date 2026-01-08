package arrayList_ex;

import java.util.ArrayList;

// Update an element at a given index in an ArrayList.

public class ArrayList_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(5667);
		arr.add(23);
		arr.add(65);
		arr.add(66);
		arr.add(45);
		arr.add(33);
		
		System.out.println("Elements: "+arr);
		
		arr.set(3, 50);
		
		System.out.println("New Elements: "+arr);

	}

}
