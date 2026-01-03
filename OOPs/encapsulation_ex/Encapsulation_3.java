package encapsulation_ex;

// Modify private variables using setters.

class Employee{
	
	private String name;
	private int id;
	private double salary;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
}

public class Encapsulation_3 {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.setId(11);
		e1.setName("Arun jadhav");
		e1.setSalary(55000.45);
		
		e2.setId(12);
		e2.setName("Priya");
		e2.setSalary(45000.23);
		
		
		
		System.out.println("Employee ID: "+e1.getId());
		System.out.println("Employee Name: "+e1.getName());
		System.out.println("Employee Salary: "+e1.getSalary());
		System.out.println("-----------------------------------------");
		
		System.out.println("Employee ID: "+e2.getId());
		System.out.println("Employee Name: "+e2.getName());
		System.out.println("Employee Salary: "+e2.getSalary());
		System.out.println("-----------------------------------------");

	}

}
