package hashSet_ex;

import java.util.HashSet;
import java.util.Set;

// Check whether a specific element exists in a HashSet.

public class HashSet_6 {

	public static void main(String[] args) {
		
		Set<String> name = new HashSet<>();

		name.add("Arun");
		name.add("Tushar");
		name.add("Vishal");
		name.add("Uday");
		name.add("Rushi");
	
	
		
			if(name.contains("Nandu")) {
				System.out.println("Element exists in HashSet...");
			}else {
				System.out.println("Element not exists in HashSet...");
		    }
		
	}

}
