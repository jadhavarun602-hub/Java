package class_object_ex;

 // Create a class and call its method using an object.

class Student_a {
	
	String Name;
	String Department;
	int roll;
	
	public void showName() {
		System.out.println("Name: "+Name);
	}
	
	public void showDepartment() {
		System.out.println("Dpartment: "+Department);
	}
	
	public void showRoll() {
		System.out.println("Roll: "+roll);
	}
	
	
}

public class Class_Object_5 {

	public static void main(String[] args) {
		
		Student_a s1 = new Student_a();
		
		s1.Name = "Arun";
		s1.Department = "IT";
		s1.roll = 21;

		s1.showName();
		s1.showDepartment();
		s1.showRoll();
	}

}
