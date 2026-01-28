package predicate_ex;

import java.util.function.Predicate;

// Create a Predicate<Integer> to check whether a number is even.

public class Predicate_1 {

	public static void main(String[] args) {
		
		Predicate<Integer> isEven = x -> x % 2 == 0;
		System.out.println("isEven: "+isEven.test(45));

	}

}
