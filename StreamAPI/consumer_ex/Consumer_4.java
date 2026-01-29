package consumer_ex;

import java.util.function.Consumer;

// Create a Consumer<String> to display the length of a string.

public class Consumer_4 {

	public static void main(String[] args) {
		
		Consumer<String> display = x -> System.out.println(x.length());
		display.accept("Arun Jadhav");

	}

}
