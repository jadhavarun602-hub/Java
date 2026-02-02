package function_ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// Use Function with Stream map() to transform a list of integers to their squares.

public class Function_6 {

	public static void main(String[] args) {
		
		Function<Integer,Integer> fun = i -> i * i;
		
		List<Integer> list = Arrays.asList(12,5,8,9,7,55);
		
//		System.out.println(list.stream().map(fun).toList());
		
		List<Integer> newList = list.stream().map(fun).toList();
		
		System.out.println(newList);
		

	}

}
