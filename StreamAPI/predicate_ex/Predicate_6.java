package predicate_ex;

import java.util.Arrays;
import java.util.List;

// Use Predicate with Stream to filter even numbers from a list.

public class Predicate_6 {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(22,56,77,88,97,15);
		
		System.out.println(num.stream().filter(i -> i % 2 == 0).toList());
	}

}
