package function_ex;

import java.util.function.Function;

// Create a Function<Integer, Integer> to square a number.

public class Function_1 {

	public static void main(String[] args) {
		
		Function<Integer,Integer> fun = (i) -> (i * i);
		System.out.println("Square of Num: "+fun.apply(12));

	}

}
