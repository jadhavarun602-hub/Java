package consumer_ex;

import java.util.function.Consumer;

//  Demonstrate that Consumer does not return any value.

public class Consumer_14 {

	public static void main(String[] args) {
		
		Consumer<Integer> c = s -> System.out.println("value is: "+s);
		
		c.accept(4);

	}

}
