package hashSet_ex;

import java.util.HashSet;
import java.util.Set;

// Remove an element from a HashSet.

public class HashSet_7 {

	public static void main(String[] args) {
		
		Set<Integer> ele = new HashSet<>();
		
		ele.add(90);
		ele.add(80);
		ele.add(70);
		ele.add(60);
		ele.add(50);
		ele.add(40);
		
		System.out.println("Before removal:");
		
		for(int i : ele) {
			System.out.println(i);
		}
		
		System.out.println("remove element 70 : "+ele.remove(70));
		
		System.out.println("After removal:");
		
		for(int i : ele) {
			System.out.println(i);
		}
		

	}

}
