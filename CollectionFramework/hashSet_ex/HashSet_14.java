package hashSet_ex;

import java.util.HashSet;

// Compare two HashSets for equality

public class HashSet_14 {

	public static void main(String[] args) {
		
		HashSet<Integer> set1 = new HashSet<>();
		set1.add(11);
		set1.add(22);
		set1.add(33);
		set1.add(44);
		set1.add(55);
		
		HashSet<Integer> set2 = new HashSet<>();
		
		set2.add(55);
		set2.add(44);
		set2.add(33);
		set2.add(22);
		set2.add(11);
		
		System.out.println(set1.equals(set2));

	}

}
