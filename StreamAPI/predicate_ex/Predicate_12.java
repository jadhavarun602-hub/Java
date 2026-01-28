package predicate_ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Use a Predicate<String> to filter strings that contain a specific word

public class Predicate_12 {

	public static void main(String[] args) {
		
		List<String> word = Arrays.asList("happy","good","sad","narvas","fresh","modern","had");
		
		Predicate<String> fil = f -> f.contains("a");
		
		List<String> result = word.stream().filter(fil).toList();
		
		System.out.println(result);
	}

}
