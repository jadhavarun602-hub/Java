package predicate_ex;

import java.util.function.Predicate;

// Create a Predicate<Integer> to check whether a number is positive.

public class Predicate_5 {

	public static void main(String[] args) {
		
		Predicate<Integer> isPositive = i -> i > 0;
		System.out.println("Number is Positive: "+isPositive.test(9));

	}

}
