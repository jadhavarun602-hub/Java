package consumer_ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Use a Consumer<Integer> with forEach() to print elements of a list.

public class Consumer_3 {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(12,45,67,89,89,54,345);
		
		Consumer<Integer> ele = x -> System.out.println(x);
		
		list.forEach(ele);

	}

}
