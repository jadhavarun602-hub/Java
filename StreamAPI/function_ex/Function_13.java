package function_ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

// Use Function to transform a list of employee salaries to annual salary (salary * 12).

public class Function_13 {

	public static void main(String[] args) {
	
		List<Integer> salary = Arrays.asList(25000,50000,75000,100000,150000,200000);
		
		Function<Integer,Integer> salarymodifi = i -> i * 12;
		
		List<Integer> annualsalary = salary.stream().map(salarymodifi).toList();
		
		System.out.println(annualsalary);
		
		
		

	}

}
