package arrayList_ex;

import java.util.ArrayList;

// Merge two ArrayLists into a single list.

public class ArrayList_22 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr1 = new ArrayList<>();
		
		arr1.add(11);
		arr1.add(22);
		arr1.add(33);
		arr1.add(44);
		
		ArrayList<Integer> arr2 = new ArrayList<>();

		arr2.add(55);
		arr2.add(66);
		arr2.add(77);
		arr2.add(88);
		
		ArrayList<Integer> merge = new ArrayList<>();
		merge.addAll(arr1);
		merge.addAll(arr2);
		
		System.out.println(merge);
	}

}
