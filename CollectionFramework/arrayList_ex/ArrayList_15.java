package arrayList_ex;

import java.util.ArrayList;

// Find the maximum and minimum element in an ArrayList.

public class ArrayList_15 {

	public static void main(String[] args) {
		
		ArrayList<Integer> ele = new ArrayList<>();
		
		ele.add(45);
		ele.add(23);
		ele.add(11);
		ele.add(66);
		ele.add(21);
		
		int max = ele.get(0);
		int min = ele.get(0);
		
		for(int num : ele) {
			if(num > max ) {
				max = num;
			}
			
			if(num < min) {
				min = num;
			}
		}
		
		System.out.println("Maximum: "+max);
		System.out.println("Minimum: "+min);

	}

}
