package hashSet_ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Iterate through a HashSet using an Iterator.

public class HashSet_9 {

	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<>();
		
		set.add(11);
		set.add(22);
		set.add(33);
		set.add(44);
		set.add(55);
		set.add(66);
		set.add(77);
		set.add(88);
		
		System.out.println("HashSet Elements...");
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
