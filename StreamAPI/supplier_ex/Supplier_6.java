package supplier_ex;

import java.util.function.Supplier;

// Use a Supplier<String> to return a default value when no input is provided

public class Supplier_6 {

	public static void main(String[] args) {
		
		Supplier<String> defaultValue = () -> "default";
		System.out.println(defaultValue.get());

	}

}
