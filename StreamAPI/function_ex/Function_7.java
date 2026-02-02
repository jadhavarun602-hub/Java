package function_ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// Use Function with Stream map() to convert a list of strings to their lengths.

public class Function_7 {

	public static void main(String[] args) {
		
		Function<String,Integer> length = l -> l.length();
		
		List<String> names = Arrays.asList("Arun","Nandkumar","Golu","Snadip","Sapna","Chotu");
		
		List<Integer> list = names.stream().map(length).toList();
		
		System.out.println(list);

	}

}
