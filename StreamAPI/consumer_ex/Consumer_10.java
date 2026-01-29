package consumer_ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Use a Consumer<Integer> to print only positive numbers from a stream.

public class Consumer_10 {

	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(12,34,-34,66,-77,23,-90);
		
		Consumer<Integer> ele = x -> System.out.println(x);
		
		num.stream().filter(i -> i > 0).forEach(ele);

	}

}
