package arrayList_ex;

import java.util.ArrayList;

// Copy all elements from one ArrayList to another.

public class ArrayList_21 {

	public static void main(String[] args) {
		
		ArrayList<Integer> ele = new ArrayList<>();
		
		ele.add(34);
		ele.add(56);
		ele.add(12);
		ele.add(89);
		ele.add(90);
		ele.add(43);
		ele.add(23);
		
		System.out.println("Original Elements...");
		
		for(int i : ele) {
			System.out.print(i+" ");
		}
		
		System.out.println("\nCopy Elements...");
		
//		ArrayList<Integer> copy = new ArrayList<>(ele);	
//		System.out.println(copy);
		
		ArrayList<Integer> copy = new ArrayList<>();	
		
		copy.addAll(ele);
		System.out.println(copy);
		
		
		
		

	}

}
