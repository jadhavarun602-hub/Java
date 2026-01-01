package class_object_ex;

 // Create a class with student details and display them.

class Student_b {
	String std_Name;
	String std_college;
	int std_roll;
	String std_Dept;
	
	
	
	public Student_b(String std_Name, String std_college, int std_roll, String std_Dept) {
		super();
		this.std_Name = std_Name;
		this.std_college = std_college;
		this.std_roll = std_roll;
		this.std_Dept = std_Dept;
	}



	public void display() {
		System.out.println("Student name: "+std_Name);
		System.out.println("Student college: "+std_college);
		System.out.println("Student roll: "+std_roll);
		System.out.println("Student department: "+std_Dept);
		System.out.println("----------------------------------------");
	}
	
}

public class Class_Object_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student_b s1 = new Student_b("Arun","SMC",714,"Information Technology");
		Student_b s2 = new Student_b("Tushar","SP",43224,"Biotech");
		
		
//		s1.std_Name = "Arun";
//		s1.std_college = "SMC";
//		s1.std_roll = 714;
//		s1.std_Dept = "Information Technology";
//		
//		s2.std_Name = "Tushar";
//		s2.std_college = "SP";
//		s2.std_roll = 43244;
//		s2.std_Dept = "Biotech";
		
		s1.display();
		s2.display();
		
		
	}

}
