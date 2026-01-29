package consumer_ex;

import java.util.function.Consumer;

// Use a Consumer<Integer> to square a number and print the result.

public class Consumer_8 {

	public static void main(String[] args) {
		
		Consumer<Integer> square = s -> System.out.println(s * s);
		square.accept(12);

	}

}
