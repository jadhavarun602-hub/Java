package consumer_ex;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

// Use Consumer with Map.forEach() to print key–value pairs.

public class Consumer_13 {

	public static void main(String[] args) {
		
		Map<Integer,String> is = new HashMap<>();
		
		is.put(11, "Arun");
		is.put(12, "Nandu");
		is.put(13, "Rahul");
		is.put(14, "chetan");
		
		BiConsumer<Integer,String> print = (x,y) -> System.out.println(x+" : "+y);
		
		is.forEach(print);

	}

}
