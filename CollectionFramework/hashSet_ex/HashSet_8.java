package hashSet_ex;

import java.util.HashSet;
import java.util.Set;

// Remove all elements from a HashSet.

public class HashSet_8 {

	public static void main(String[] args) {
		
		Set<Integer> s = new HashSet<>();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(70);
		
		System.out.println("Before Elements..");
		for(int i : s) {
			System.out.println(i);
		}
		
		s.clear();
		
		System.out.println("After Elements...");
		
		System.out.println("HashSet is Empty: "+s.isEmpty());
		
		

	}

}
