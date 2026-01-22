package stream_ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

// print missing element

public class PrintMissing {

	public static void main(String[] args) {
		
		List<Integer> ele = Arrays.asList(2,5,7,9,13,17,20);
		
		IntStream.rangeClosed(1, 20)
		.forEach((i) -> {
			if(!ele.contains(i)) {
				System.out.println(i);
			}
		});

	}

}
