package function_ex;

import java.util.function.Function;

// Create a Function<String, Boolean> to check if the string contains a specific word

public class Function_11 {

	public static void main(String[] args) {
		
		String word = "Hello World";
		
		Function<String,Boolean> contain = i -> i.contains(word);
		System.out.println(contain.apply("Hello World"));
		System.out.println(contain.apply("Java World"));

	}

}
