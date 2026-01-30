package supplier_ex;

import java.util.function.Supplier;

// Demonstrate that Supplier does not take any input argument.

public class Supplier_8 {

	public static void main(String[] args) {
		
		Supplier<String> sup = () -> "";
		System.out.println(sup.get());

	}

}
