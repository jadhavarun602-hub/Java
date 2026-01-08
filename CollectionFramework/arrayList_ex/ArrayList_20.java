package arrayList_ex;

import java.util.ArrayList;
import java.util.ListIterator;

// Print elements of an ArrayList in reverse order.

public class ArrayList_20 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(34);
		arr.add(22);
		arr.add(89);
		arr.add(56);
		arr.add(12);
		arr.add(76);
		arr.add(90);
		
		ListIterator<Integer> list = arr.listIterator(arr.size());
		
		while(list.hasPrevious()) {
			System.out.println(list.previous());
		}
		
//		for(int i = arr.size()-1; i >= 0; i--) {
//			System.out.println(arr.get(i));
//		}

	}

}
