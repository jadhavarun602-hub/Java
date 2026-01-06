package abstraction_interface_ex;

// Create abstract class with constructor.

abstract class Employee{
	
	String empName;
	int empId;
	
	Employee(String empName,int empId){
		this.empName = empName;
		this.empId = empId;
	}

	abstract void info();
	
}

class NewEmp extends Employee{

	NewEmp(String empName, int empId) {
		super(empName, empId);
		
	}

	public void info() {
		System.out.println("Employee Name: "+empName);
		System.out.println("Employee Id: "+empId);
	}
	
}

public class Abstraction_4 {

	public static void main(String[] args) {
		
		Employee e = new NewEmp("Arun Jadhav", 1234);
		e.info();

	}

}
