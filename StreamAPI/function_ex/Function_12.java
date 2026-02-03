package function_ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// Create a Function<List<String>, Integer> to get the size of a list.

public class Function_12 {

	public static void main(String[] args) {
		
		List<String> fruit = Arrays.asList("banana","apple","cherry","painapple","mango");
		
		Function<List<String>,Integer> li = i -> i.size();
		
		System.out.println(li.apply(fruit));
		

	}

}
