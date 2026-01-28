package predicate_ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Use Predicate with Stream to filter strings with length > 5.

public class Predicate_7 {

	public static void main(String[] args) {
		
		List<String> str = Arrays.asList("Arun","tushar","vishal","uday","Nandkumar","pooja");
		
		Predicate<String> filter = s -> s.length() > 5;
		
		List<String> result = str.stream()
		.filter(filter)
		.toList();
		
		System.out.println(result);

	}

}
