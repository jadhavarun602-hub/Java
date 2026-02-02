package function_ex;

import java.util.function.Function;

// Create a Function<String, Integer> to find the length of a string.

public class Function_2 {

	public static void main(String[] args) {
		
		Function<String,Integer> si = (s) -> s.length();
		System.out.println("length of a string: "+si.apply("Hello World"));

	}

}
