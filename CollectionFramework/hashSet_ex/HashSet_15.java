package hashSet_ex;

import java.util.HashSet;
import java.util.Set;

// Find the union of two HashSets.

public class HashSet_15 {

	public static void main(String[] args) {
		
		HashSet<Integer> h1 = new HashSet<>();
		
		h1.add(12);
		h1.add(13);
		h1.add(14);
		h1.add(15);
		h1.add(16);
		
		HashSet<Integer> h2 = new HashSet<>();
		h2.add(17);
		h2.add(18);
		h2.add(14);
		h2.add(19);
		h2.add(20);
		
		Set<Integer> union = new HashSet<>(h1);
		
		union.addAll(h2);
		
		for(int i : union) {
			System.out.println(i);
		}

	}

}
