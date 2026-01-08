package arrayList_ex;

import java.util.ArrayList;

// Remove all elements from an ArrayList.

public class ArrayList_10 {

	public static void main(String[] args) {
		
		ArrayList<Integer> a = new ArrayList<>();
		
		a.add(65);
		a.add(22);
		a.add(43);
		a.add(98);
		a.add(78);
		a.add(13);
		a.add(90);
		
		System.out.println("Element: "+a);
		
		a.clear();
//		a.removeAll(a);
		
		System.out.println("Element: "+a);
	}

}
