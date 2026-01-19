package hashSet_ex;

import java.util.HashSet;
import java.util.Set;

// Convert a HashSet into an array.

public class HashSet_12 {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
		set.add(17);
		set.add(24);
		set.add(32);
		set.add(48);
		set.add(55);
		set.add(63);
		set.add(77);
		
		Integer[] arr = set.toArray(new Integer[0]);
		
		for(int i : arr) {
			System.out.println(i);
		}

	}

}
