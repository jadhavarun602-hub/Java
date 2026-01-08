package arrayList_ex;

import java.util.ArrayList;

//Access elements from an ArrayList using index.

public class ArrayList_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		nums.add(23);
		nums.add(76);
		nums.add(45);
		nums.add(87);
		nums.add(33);
		
//		System.out.println("Access Index: "+nums.get(3));
		
		int index = 3;

		if(index >= 0 && index <= nums.size()) {
			System.out.println("Element at Index "+index+" : "+nums.get(index));
		}else {
			System.out.println("Invalid Index...");
		}

	}

}
