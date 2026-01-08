package arrayList_ex;

import java.util.ArrayList;
import java.util.ListIterator;

// Traverse an ArrayList using ListIterator.

public class ArrayList_19 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(23);
		arr.add(56);
		arr.add(90);
		arr.add(23);
		arr.add(12);
		arr.add(87);
		arr.add(45);
		
		ListIterator<Integer> it = arr.listIterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
