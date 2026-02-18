package examples;

import java.util.Map;
import java.util.stream.Collectors;

public class Count_frq {

	public static void main(String[] args) {
		
		String str = "Programmin";
		
		Map<Character, Long> map = 
				str.chars()
				.mapToObj(c -> (char)c)
				.collect(Collectors.groupingBy(c -> c,Collectors.counting()));
		
		System.out.println(map);
		
	

	}

}
