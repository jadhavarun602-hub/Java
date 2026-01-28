package predicate_ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Create a Predicate<Employee> to filter employees with salary > 30000.

class Employee{
	String name;
	int salary;
	
	Employee(String name,int salary){
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return name+" : " +salary;
		
	}
}

public class Predicate_13 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Arun",80000);
		Employee e2 = new Employee("Tushar",10000);
		Employee e3 = new Employee("Rahul",220000);
		Employee e4 = new Employee("Uday",8000);
		
		List<Employee> emp = Arrays.asList(e1,e2,e3,e4);
		
		Predicate<Employee> fil = e -> e.salary > 30000;
		
		List<Employee> result = emp
				.stream()
				.filter(fil)
				.toList();
		
		System.out.println(result);
					

	}

}
