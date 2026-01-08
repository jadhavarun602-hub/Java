package arrayList_ex;

import java.util.ArrayList;

// Traverse an ArrayList using a for loop.


public class ArrayList_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(23);
		arr.add(77);
		arr.add(90);
		arr.add(12);
		arr.add(45);
		arr.add(34);
		arr.add(55);
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}

}
