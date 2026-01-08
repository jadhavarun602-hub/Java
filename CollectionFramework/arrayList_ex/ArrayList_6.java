package arrayList_ex;

import java.util.ArrayList;

// Insert an element at a specific index in an ArrayList.

public class ArrayList_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(45);
		arr.add(20);
		arr.add(11);
		arr.add(87);
		arr.add(90);
		
		System.out.println("Elements: "+arr);
		
		arr.add(2,30);
		
		System.out.println("New Elements: "+arr);
		
//		System.out.println(arr.size());

	}

}
