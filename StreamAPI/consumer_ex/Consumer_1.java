package consumer_ex;

import java.util.function.Consumer;

// Create a Consumer<Integer> to print a number.

public class Consumer_1 {

	public static void main(String[] args) {

		Consumer<Integer> num = x -> System.out.println(x);
		num.accept(50);

	}

}
