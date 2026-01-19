package hashSet_ex;

import java.util.HashSet;

// Copy all elements from one HashSet to another HashSet

public class HashSet_13 {

	public static void main(String[] args) {
		
		HashSet<Integer> h1 = new HashSet<>();
		
		h1.add(10);
		h1.add(20);
		h1.add(30);
		h1.add(40);
		h1.add(50);
		h1.add(60);
		
		
//		HashSet<Integer> h2 = new HashSet<>(h1);
		
		HashSet<Integer> h2 = new HashSet<>();
		
		h2.addAll(h1);
		
		for(int i : h2) {
			System.out.println(i);
		}
		

	}

}
