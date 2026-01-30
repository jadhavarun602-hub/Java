package supplier_ex;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

// Create a Supplier<List<String>> that returns a new empty list.

public class Supplier_7 {

	public static void main(String[] args) {
		
		Supplier<List<String>> listStr = () -> new ArrayList<>();
		System.out.println(listStr.get());

	}

}
