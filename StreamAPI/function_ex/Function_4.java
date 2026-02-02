package function_ex;

import java.util.function.Function;

// Create a Function<Integer, String> to convert an integer to string

public class Function_4 {

	public static void main(String[] args) {
		
		Function<Integer,String> convert = input -> input.toString();
		System.out.println(convert.apply(555));
	}

}
