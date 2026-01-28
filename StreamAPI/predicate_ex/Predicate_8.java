package predicate_ex;

import java.util.function.Predicate;

// Create two Predicate<Integer> and combine them using and().

public class Predicate_8 {

	public static void main(String[] args) {
		
		Predicate<Integer> p1 = i -> i > 10;
		Predicate<Integer> p2 = i -> i % 2 == 0;
		
		System.out.println(p1.and(p2).test(12));

	}

}
