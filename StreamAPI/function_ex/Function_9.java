package function_ex;

import java.util.function.Function;

// Combine two Function<Integer, Integer> using compose() (e.g., square then double).

public class Function_9 {

	public static void main(String[] args) {
		
		Function<Integer,Integer> sq = i -> i * i;
		
		Function<Integer,Integer> dob = j -> j * 2;
		
		Function<Integer,Integer> com = sq.compose(dob);
		
		System.out.println(com.apply(20));

	}

}
