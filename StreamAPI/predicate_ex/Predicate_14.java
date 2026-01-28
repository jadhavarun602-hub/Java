package predicate_ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Use a Predicate<Integer> inside removeIf() on a collection.

public class Predicate_14 {

	public static void main(String[] args) {
		
		List<Integer> num = new ArrayList<>(Arrays.asList(23,55,78,99,12,76,34,23));
		
		Predicate<Integer> isEven = x -> x % 2 == 0;
		
		num.removeIf(isEven);
		
		System.out.println(num);

	}

}
