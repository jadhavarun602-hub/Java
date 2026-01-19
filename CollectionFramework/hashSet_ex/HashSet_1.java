package hashSet_ex;

import java.util.HashSet;
import java.util.Set;

// Create a HashSet and add integer elements to it.

public class HashSet_1 {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
		set.add(56);
		set.add(90);
		set.add(45);
		set.add(12);
		set.add(10);
		set.add(33);
		set.add(12);
		
//		Set<Integer> set = Set.of(56,90,45,12,10,33,12);
		
		
		
		System.out.println("Set elements: "+set);
		
		

	}

}
