package function_ex;

import java.util.function.Function;

// Create a Function<String, String> to convert a string to uppercase

public class Function_3 {

	public static void main(String[] args) {
		
		Function<String,String> str = (i) -> i.toUpperCase();
		
		System.out.println(str.apply("arun jadhav"));

	}

}
