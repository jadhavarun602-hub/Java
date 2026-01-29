package consumer_ex;

import java.util.function.Consumer;

// Create a Consumer<Integer> to print multiplication table of a number

public class Consumer_12 {

	public static void main(String[] args) {
		
		Consumer<Integer> table = x -> { 
			for(int i = 1; i <= 10; i++) 
				
			System.out.println(x+" X "+ i +" = "+(x*i));
	     };
		
		table.accept(3);

	}

}
