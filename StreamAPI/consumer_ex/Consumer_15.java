package consumer_ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Create a reusable Consumer<Integer> and apply it to multiple streams. 

public class Consumer_15 {

	public static void main(String[] args) {
		
		Consumer<Integer> con = k -> System.out.println(k);
		
		List<Integer> list = Arrays.asList(12,45,-68,90,12,-23,55,88,90);
		
		list.stream().filter(i -> i > 0).forEach(con);
		
		System.out.println("................................................");
		
		list.stream().filter(i -> i % 2 == 0).forEach(con);
		
		System.out.println("................................................");
		
		list.stream().distinct().forEach(con);;
		
		
		
		
		

	}

}
