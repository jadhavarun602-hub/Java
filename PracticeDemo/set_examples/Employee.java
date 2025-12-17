package set_examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {
	String name;
	int salary;
	
	public Employee(String name,int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public int compareTo(Employee o) {
		
		return Integer.compare(this.salary, o.salary);
	}
	

	public static void main(String[] args) {
		
		
		List<Employee> emp = new ArrayList<>();
		
		emp.add(new Employee("Arun",50000));
		emp.add(new Employee("Rahul",35000));
		emp.add(new Employee("Nandkumar",75000));
		emp.add(new Employee("Priya",50000));
		emp.add(new Employee("Pooja",45000));
		
		Collections.sort(emp);
		
		for(Employee n : emp) {
			System.out.println(n.name+" : "+n.salary);
		}
		
		
		
		

	}

}
