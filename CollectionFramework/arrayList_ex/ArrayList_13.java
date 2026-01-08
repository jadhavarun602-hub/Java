package arrayList_ex;

import java.util.ArrayList;

// Check whether an ArrayList is empty or not.

public class ArrayList_13 {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<>();
		
//		num.add(65);
//		num.add(23);
//		num.add(98);
//		num.add(34);
//		num.add(11);
//		
		System.out.println("Num's: "+num);
		
		if(num.isEmpty()) {
			System.out.println("ArrayList is empty");
		}else {
			System.out.println("ArrayList is not empty");
		}
	}

}
