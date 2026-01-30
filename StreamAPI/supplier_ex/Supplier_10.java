package supplier_ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

// Create a reusable Supplier<String> and call get() multiple times.

public class Supplier_10 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Arun","Sumit","Ketan","Riya");
		
		Supplier<String> call = () -> " Good Morning";
//		System.out.println(call.get());
		
		for(String name : names) {
			System.out.println(name+" "+call.get());
		}

	}

}
