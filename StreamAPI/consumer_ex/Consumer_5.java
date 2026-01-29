package consumer_ex;

import java.util.function.Consumer;

// Create a Consumer<Integer> to print whether a number is even or odd.

public class Consumer_5 {

	public static void main(String[] args) {
		
		Consumer<Integer> con = i -> System.out.println(i % 2 == 0 ? "Even" : "Odd");
		con.accept(49);

	}

}
