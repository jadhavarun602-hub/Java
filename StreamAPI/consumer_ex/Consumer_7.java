package consumer_ex;

import java.util.function.Consumer;

// Create two Consumer<Integer> and combine them using andThen().

public class Consumer_7 {

	public static void main(String[] args) {
		
		Consumer<Integer> con1 = x -> System.out.println(x*12);
		
		Consumer<Integer> con2 = i -> System.out.println(i+5);
		
		Consumer<Integer> con3 = con1.andThen(con2);
		con3.accept(10);
		

	}

}
