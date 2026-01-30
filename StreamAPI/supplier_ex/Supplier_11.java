package supplier_ex;

import java.util.function.Supplier;

// Create a Supplier<Employee> that returns a new Employee object

class Employee{
	
	String name = "Arun";
	int id = 12;
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
	
	
}

public class Supplier_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Employee> emp = () -> new Employee();
		System.out.println(emp.get());
		

	}

}
