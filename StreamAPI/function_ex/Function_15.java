package function_ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// Use a Function to convert a list of strings to lowercase using map()

public class Function_15 {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("ABC","PQR","XYZ","DKDJ","3TRGT","GJNBHUH");
		
		Function<String,String> lowercase = i -> i.toLowerCase();
		
		List<String> newList = list.stream().map(lowercase).toList();
		
		System.out.println(newList);
		
	}

}
