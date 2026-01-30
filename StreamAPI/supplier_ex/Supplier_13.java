package supplier_ex;

import java.util.function.Function;
import java.util.function.Supplier;

// Compare Supplier.get() with Function.apply().

public class Supplier_13 {

	public static void main(String[] args) {
		
		Supplier<Integer> sup = () -> 100;
		
		System.out.println("Supplier: "+sup.get());
		
		Function<Integer,Integer> fun = x -> x * 12 ;
		
		System.out.println("Function: "+fun.apply(22));
		

	}

}
