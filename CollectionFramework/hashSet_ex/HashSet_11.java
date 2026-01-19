package hashSet_ex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Convert a HashSet into an ArrayList

public class HashSet_11 {

	public static void main(String[] args) {
		

		Set<Integer> set = new HashSet<>();
		
		set.add(12);
		set.add(23);
		set.add(34);
		set.add(45);
		set.add(12);
		set.add(56);
		set.add(67);
		
		System.out.println("HashSet Elements...");
		
		for(int i : set) {
			System.out.println(i);
		}
		
		List<Integer> arr = new ArrayList<>(set);
		
		System.out.println("ArrayList Elements...");
		
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
