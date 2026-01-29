package consumer_ex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// Create a Consumer<Employee> to print employee details.

class Employee{
	
	int id;
	String name;
	double salary;
	
	Employee(int id,String name,double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	void display() {
		System.out.println("Employee Id: "+id);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Salary: "+salary);
		System.out.println("___________________________________");
	}
}

public class Consumer_9 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(11,"Arun",50000);
		Employee e2 = new Employee(12,"Nandkumar",70000);
		Employee e3 = new Employee(13,"Pooja",60000);
		Employee e4 = new Employee(14,"Priya",55000);
		
		List<Employee> em = Arrays.asList(e1,e2,e3,e4);
		
		Consumer<Employee> emp = print -> print.display();
		
		em.forEach(emp);
				
		
//		emp.accept(e1);
//		emp.accept(e2);
//		emp.accept(e3);
//		emp.accept(e4);
//		
		

	}

}
