package predicate_ex;

import java.util.function.Predicate;

// Use a Predicate<String> to check whether a string is empty.

public class Predicate_3 {

	public static void main(String[] args) {
		
		Predicate<String> str = x -> x.isEmpty();
		
		System.out.println("String is Empty: "+str.test("Arun"));

	}

}
