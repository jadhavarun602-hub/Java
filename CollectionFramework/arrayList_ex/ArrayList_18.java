package arrayList_ex;

import java.util.ArrayList;
import java.util.Iterator;

// Traverse an ArrayList using Iterator

public class ArrayList_18 {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<>();
		
		num.add(34);
		num.add(23);
		num.add(12);
		num.add(89);
		num.add(56);
		num.add(90);
		num.add(45);
		num.add(33);
		
		Iterator<Integer> it = num.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
