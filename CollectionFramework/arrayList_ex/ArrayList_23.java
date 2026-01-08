package arrayList_ex;

import java.util.ArrayList;
import java.util.Collections;

// Sort an ArrayList in ascending order.

public class ArrayList_23 {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<>();
		
		num.add(65);
		num.add(34);
		num.add(98);
		num.add(10);
		num.add(67);
		num.add(12);
		
		Collections.sort(num);
		System.out.println(num);
		

	}

}
