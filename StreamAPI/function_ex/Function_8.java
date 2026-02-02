package function_ex;

import java.util.function.Function;

// Combine two Function<Integer, Integer> using andThen() (e.g., double then square).

public class Function_8 {

	public static void main(String[] args) {
		
		Function<Integer,Integer> doubleNum = i -> i*2;
		
		Function<Integer,Integer> squareNum = j -> j*j;
		
		Function<Integer,Integer> DSquare = doubleNum.andThen(squareNum);
		
		System.out.println(DSquare.apply(7));

	}

}
