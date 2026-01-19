package hashSet_ex;

import java.util.HashSet;

// Add duplicate elements to a HashSet and observe the output.

public class HashSet_3 {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>();
		
		set.add(34);
		set.add(12);
		set.add(90);
		set.add(34);
		set.add(55);
		set.add(90);
		
		for(int i : set) {
			System.out.println(i);
		}
	}

}
