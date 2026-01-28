package predicate_ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Create a reusable Predicate<Integer> and apply it to multiple streams.

public class Predicate_15 {

	public static void main(String[] args) {
		
		Predicate<Integer> isEven = x -> x % 2 == 0;
		
		List<Integer> l1 = Arrays.asList(12,23,45,66,77,98);
		List<Integer> l2 = Arrays.asList(56,89,12,54,97,62);
		List<Integer> l3 = Arrays.asList(76,89,90,64,23,11);
		List<Integer> l4 = Arrays.asList(123,456,788,990,451);
		
		System.out.println(l1.stream().filter(isEven).toList());
		System.out.println(l2.stream().filter(isEven).toList());
		System.out.println(l3.stream().filter(isEven).toList());
		System.out.println(l4.stream().filter(isEven).toList());

	}

}
