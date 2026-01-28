package predicate_ex;

import java.util.function.Predicate;

// Create a Predicate<Integer> to check whether a number is greater than 50.

public class Predicate_2 {

	public static void main(String[] args) {
		
		Predicate<Integer> check = i -> i > 50;
		System.out.println("check whether a number is greater than 50: "+check.test(18));

	}

}
