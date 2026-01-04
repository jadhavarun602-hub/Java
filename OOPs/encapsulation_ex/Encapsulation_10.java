package encapsulation_ex;

//Use encapsulation for employee salary.

class Employee_1 {
	private int empId;
	private String empName;
	private double empSalary;
	
	public void setEmpId(int empId) {
		if(empId > 0) {
			this.empId = empId;
		}else {
			System.out.println("Enter valid Employee Id");
		}
	}
	
	public void setEmpName(String empName) {
		if(empName != null && !empName.isEmpty()) {
			this.empName = empName;
		}else {
			System.out.println("Enter valid Employee Name");
		}
	}
	
	public void setEmpSalary(double empSalary) {
		if(empSalary > 0) {
			this.empSalary = empSalary;
		}else {
			System.out.println("Salary must be greater than 0");
		}
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public double getEmpSalary() {
		return empSalary;
	}
}

public class Encapsulation_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee_1 e1 = new Employee_1();
		
		e1.setEmpName("Arun jadhav");
		e1.setEmpId(125555);
		e1.setEmpSalary(55500.50);
		
		System.out.println("Employee Name: "+e1.getEmpName());
		System.out.println("Employee Id: "+e1.getEmpId());
		System.out.println("Employee Salary: "+e1.getEmpSalary());

	}

}
