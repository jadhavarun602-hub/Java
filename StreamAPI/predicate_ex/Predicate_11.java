package predicate_ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Use a Predicate<Integer> to filter numbers divisible by 3 from a list.

public class Predicate_11 {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(12,33,45,89,57,19,34,66);
		
		Predicate<Integer> div = s -> s % 3 == 0;
		
		List<Integer> result = numbers
		.stream()
		.filter(div)
		.toList();
		
		System.out.println(result);

	}

}
