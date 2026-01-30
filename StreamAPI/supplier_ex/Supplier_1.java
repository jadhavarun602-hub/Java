package supplier_ex;

import java.util.function.Supplier;

// Create a Supplier<Integer> that returns a constant value.

public class Supplier_1 {

	public static void main(String[] args) {
		
		
		Supplier<Integer> sup = () -> 512;
		System.out.println("constant value: "+sup.get());;

	}

}
