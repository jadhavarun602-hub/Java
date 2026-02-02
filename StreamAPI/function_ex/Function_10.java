package function_ex;

import java.util.function.Function;

// Create a Function<Double, Double> to calculate the square root of a number.

public class Function_10 {

	public static void main(String[] args) {
		
		Function<Double,Double> squareRoot = Math::sqrt;
		
		System.out.println(squareRoot.apply(45.9));

	}

}
