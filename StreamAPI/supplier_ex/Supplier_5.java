package supplier_ex;

import java.util.function.Supplier;

// Create a Supplier<Integer> to generate random numbers between 1 and 100.

public class Supplier_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Integer> random = () -> (int)(Math.random()*100)+1;
		System.out.println("Random number 1 to 100 : "+random.get());

	}

}
