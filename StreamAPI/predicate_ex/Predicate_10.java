package predicate_ex;

import java.util.function.Predicate;

// Use negate() method of Predicate to reverse a condition.

public class Predicate_10 {

	public static void main(String[] args) {
		
		Predicate<String> str = x -> x.isEmpty();
		
		System.out.println(str.negate().test("Arun"));

	}

}
