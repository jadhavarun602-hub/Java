package class_object_ex;

 // Create a class with employee details and print them.

class Employee {
	
	int empID;
	String name;
	String department;
	double salary;
	
	    void employee() {
		System.out.println("Employee ID: "+empID);
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Department: "+department);
		System.out.println("Salary: "+salary);
	}
	
}

public class Class_Object_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		e1.empID = 123;
		e1.name = "Arun";
		e1.department = "Java dev";
		e1.salary = 335434.56;
		
		e1.employee();

	}

}
