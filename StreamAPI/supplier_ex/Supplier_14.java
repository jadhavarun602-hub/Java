package supplier_ex;

import java.util.function.Supplier;

// Use a Supplier<String> inside a method to lazily generate values.

public class Supplier_14 {

	public static void main(String[] args) {
		
		printMsg(() -> "Hello Word! lazily generate");
		printMsg(() -> "current time: "+System.currentTimeMillis());

	}
	
	static void printMsg(Supplier<String> sup) {
		System.out.println("Generate value: "+sup.get());
	}

}
