package function_ex;

import java.util.function.Function;

// Create a reusable Function<Integer, Boolean> to check if a number is prime.

public class Function_14 {

	public static void main(String[] args) {
		
		
		
		Function<Integer,Boolean> isPrime = n -> {
			if(n <= 1) {
				return false;
			}
			
			for(int i = 2; i <= Math.sqrt(n); i++) {
				if(n % i == 0) {
					return false;
				}
			}
			
			return true;
		};
		
		System.out.println(isPrime.apply(23));
		System.out.println(isPrime.apply(12));
		System.out.println(isPrime.apply(3));
		System.out.println(isPrime.apply(74));
		System.out.println(isPrime.apply(13));

	}

}
