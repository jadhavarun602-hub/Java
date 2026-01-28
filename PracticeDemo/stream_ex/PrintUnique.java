package stream_ex;

import java.util.Arrays;
import java.util.List;

// 	WeelCoommEES -> WLCS print the unique elements

public class PrintUnique {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("WeelCoommEES");
		
		  list.stream()
          .flatMapToInt(String::chars) 
          .distinct()                  
          .mapToObj(c -> (char) c)    
          .forEach(System.out::print); 

	}

}
