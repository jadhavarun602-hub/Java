package function_ex;

import java.util.function.Function;

// Create a Function<String, Integer> to parse an integer from a string

public class Function_5 {

	public static void main(String[] args) {
		
		Function<String,Integer> parse = i -> Integer.parseInt(i);
		System.out.println(parse.apply("678"));

	}

}
