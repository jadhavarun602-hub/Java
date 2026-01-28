package predicate_ex;

import java.util.function.Predicate;

// Create two Predicate<Integer> and combine them using or().

public class Prdicate_9 {

	public static void main(String[] args) {
		
		Predicate<Integer> pre1 = x -> x > 18;
		
		Predicate<Integer> pre2 = x -> x == 18;
		
		System.out.println(pre1.or(pre2).test(60));

	}

}
