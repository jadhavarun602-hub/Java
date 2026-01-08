package arrayList_ex;

import java.util.ArrayList;

// Check whether an element exists in an ArrayList.

public class ArrayList_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(54);
		arr.add(45);
		arr.add(89);
		arr.add(90);
		arr.add(34);
		arr.add(55);
		
		System.out.println("Elements: "+arr);
		
		int ele = 72;
		
		if(arr.contains(ele)) {
			System.out.println(ele+" exists in an Arraylist");
		}else {
			System.out.println(ele+" does not exist in an ArrayList");
		}
		
	}

}
