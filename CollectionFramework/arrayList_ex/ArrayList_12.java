package arrayList_ex;

import java.util.ArrayList;

// Find the index of a given element in an ArrayList.

public class ArrayList_12 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(43);
		arr.add(12);
		arr.add(65);
		arr.add(90);
		arr.add(87);
		arr.add(23);
		
		System.out.println("Ele: "+arr);
		
		int ele = 90;
		
		int index = arr.indexOf(ele);

        if (index != -1) {
            System.out.println(ele + " found at index: " + index);
        } else {
            System.out.println(ele + " not found in the ArrayList");
        }
	}

}
