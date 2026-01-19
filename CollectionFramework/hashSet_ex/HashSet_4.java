package hashSet_ex;

import java.util.HashSet;
import java.util.Set;

// Find the size of a HashSet.

public class HashSet_4 {

	public static void main(String[] args) {
		
		Set<Integer> num = new HashSet<>();
		
		num.add(12);
		num.add(12);
		num.add(23);
		num.add(34);
		num.add(45);
		num.add(45);
		num.add(55);
		
		System.out.println("Size of HashSet: "+num.size());
		
		for(int nums : num) {
			System.out.println(nums);
		}
	}

}
