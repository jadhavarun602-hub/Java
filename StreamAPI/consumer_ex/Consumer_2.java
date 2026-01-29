package consumer_ex;

import java.util.function.Consumer;

// Create a Consumer<String> to print a string in uppercase.

public class Consumer_2 {

	public static void main(String[] args) {
		
		Consumer<String> str = i -> System.out.println(i.toUpperCase());
		str.accept("arun jadhav");

	}

}
