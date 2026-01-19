package hashSet_ex;

import java.util.HashSet;
import java.util.Set;

// Iterate through a HashSet using enhanced for-each loop.

public class HashSet_10 {

	public static void main(String[] args) {
		
		Set<Integer> num = new HashSet<>();
		
		num.add(111);
		num.add(222);
		num.add(555);
		num.add(333);
		num.add(444);
		num.add(666);
		num.add(777);
		
		for(int value : num) {
			System.out.println(value);
		}
	}

}
