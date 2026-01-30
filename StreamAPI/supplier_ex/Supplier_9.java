package supplier_ex;

import java.util.Optional;
import java.util.function.Supplier;

// Use a Supplier<Integer> with Optional.orElseGet().

public class Supplier_9 {

	public static void main(String[] args) {
		
		Supplier<Integer> supplier = () -> 50;
		
		Optional<Integer> op = Optional.empty();
		
		Integer result = op.orElseGet(supplier);
		
		System.out.println(result);

	}

}
