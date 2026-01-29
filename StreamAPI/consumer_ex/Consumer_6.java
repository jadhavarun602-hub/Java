package consumer_ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Use a Consumer<String> to print each element of a List<String>.

public class Consumer_6 {

	public static void main(String[] args) {
		
		List<String> elements = Arrays.asList("abc","pqr","xyz","jkl");
		
		Consumer<String> ele = x -> System.out.println(x);
		
		elements.forEach(ele);

	}

}
