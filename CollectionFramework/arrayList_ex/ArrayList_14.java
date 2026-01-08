package arrayList_ex;

import java.util.ArrayList;

// Count how many times a specific element appears in an ArrayList 

public class ArrayList_14 {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<>();
		
		num.add(45);
		num.add(23);
		num.add(90);
		num.add(12);
		num.add(23);
		num.add(56);
		num.add(23);
		
		int target = 23;
		int count = 0;
		
		for(int ele : num) {
			if(ele == target) {
				count++;
			}
		}
		
		System.out.println(target + " appears " + count + " times");

	}

}
