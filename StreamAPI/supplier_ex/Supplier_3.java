package supplier_ex;

import java.util.function.Supplier;

//  Create a Supplier<Double> that returns a random number.

public class Supplier_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Double> number = () -> Math.random();
		System.out.println(number.get());

	}

}
