package predicate_ex;

import java.util.function.Predicate;

// Use a Predicate<String> to check whether a string starts with a given character

public class Predicate_4 {

	public static void main(String[] args) {
		
		Predicate<String> p = i -> i.startsWith("H");
		System.out.println("Start with H : "+p.test("Hello word"));

	}

}
