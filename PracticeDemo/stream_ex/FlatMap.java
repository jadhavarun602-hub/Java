package stream_ex;

import java.util.Arrays;
import java.util.List;

// Summation of length using flatmap

public class FlatMap {

	public static void main(String[] args) {
		
		List<String> list1 = Arrays.asList("abc","cde","akjs");
		List<String> list2 = Arrays.asList("asd","ghhs","sjdm");
		List<String> list3 = Arrays.asList("asd","ghhs","sjdm");
		List<String> list4 = Arrays.asList("asd","ghhs","sjdm");
		
		List<List<String>> list5 = Arrays.asList(list1,list2);
		List<List<String>> list6 = Arrays.asList(list3,list4);
		
		List<List<List<String>>> list7 = Arrays.asList(list5,list6);
		
	    int sum = list7
			.stream()
			.flatMap((i) -> {return i.stream();})   
			.flatMap((i) -> {return i.stream();})
			.map((i) -> {return i.length();})
			.reduce(0, (i,j) -> (i+j));
	    
	    System.out.println("Summation of length: "+sum);

	}

}
