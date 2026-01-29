package consumer_ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Use a Consumer<String> to add strings to another collection.

public class Consumer_11 {

	public static void main(String[] args) {
		
		List<String> str = Arrays.asList("Java","Python","C++","Spring");
		
		List<String> adding = new ArrayList<>();
		
		Consumer<String> con = x -> adding.add(x);
		
		str.forEach(con);
		
		System.out.println(adding);

	}

}
