package hashSet_ex;

import java.util.HashSet;

// Create a HashSet<String> and display all elements.

public class HashSet_2 {

	public static void main(String[] args) {
		
		HashSet<String> str = new HashSet<>();
		
		str.add("abc");
		str.add("pqr");
		str.add("xyz");
		str.add("rts");
		str.add("abc");
		
		for(String ele : str) {
			System.out.println(ele);
		}

	}

}
