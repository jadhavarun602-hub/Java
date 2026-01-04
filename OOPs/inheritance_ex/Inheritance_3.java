package inheritance_ex;

// Access parent class variables in child.

class College{
	String collegeName;
	
	public void show() {
		System.out.println("College Name: "+collegeName);
	}
}

class Student extends College{
	String stdName;
	String department;
	
	public Student(String collegeName,String stdName,String department) {
		super.collegeName = collegeName;
		this.stdName = stdName;
		this.department = department;
	}
	
	public void display() {
		System.out.println("Student Name: "+stdName);
		System.out.println("Student Department: "+department);
	}
	
}

public class Inheritance_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("SMC","Arun","IT");
		
		s1.show();
		s1.display();

	}

}
