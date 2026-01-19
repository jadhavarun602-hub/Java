package hashSet_ex;

import java.util.HashSet;
import java.util.Set;

// Check whether a HashSet is empty or not.

public class HashSet_5 {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
		
		if(set.isEmpty()) {
			System.out.println("HashSet is empty...");
		}else {
			System.out.println("HashSet not empty...");
		}
		
		set.add(677);
		set.add(231);
		set.add(890);
		set.add(765);
		set.add(543);
		set.add(203);
		
		System.out.println("HashSet ele: "+set);
		
		if(set.isEmpty()) {
			System.out.println("HashSet is empty...");
		}else {
			System.out.println("HashSet not empty...");
		}
	}

}
