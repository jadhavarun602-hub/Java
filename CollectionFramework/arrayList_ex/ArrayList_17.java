package arrayList_ex;

import java.util.ArrayList;

// Traverse an ArrayList using enhanced for-each loop.

public class ArrayList_17 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(12);
		arr.add(34);
		arr.add(32);
		arr.add(67);
		arr.add(89);
		arr.add(90);
		arr.add(55);
		arr.add(75);
		
		for(int i : arr) {
			System.out.println(i);
		}

	}

}
