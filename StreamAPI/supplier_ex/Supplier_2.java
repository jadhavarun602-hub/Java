package supplier_ex;

import java.util.function.Supplier;

//  Create a Supplier<String> that returns a welcome message

public class Supplier_2 {

	public static void main(String[] args) {
		
		Supplier<String> str = () -> "Wel-Come";
		System.out.println("message: "+str.get());

	}

}
