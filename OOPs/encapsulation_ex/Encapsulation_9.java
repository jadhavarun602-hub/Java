package encapsulation_ex;

// Use encapsulation for student marks.

class Student_1 {
	private String name;
	private int roll;
	private double marks;
	
	public void setName(String name) {
		if(name != null && !name.isEmpty()) {
			this.name = name;
		}else {
			System.out.println("Enter a valid name");
		}
	}
	
	public void setRoll(int roll) {
		if(roll >= 0) {
			this.roll = roll;
		}else {
			System.out.println("Enter a valid roll number");
		}
	}
	
	public void setMarks(double marks) {
		if(marks >= 0 && marks <= 100) {
			this.marks = marks;
		}else {
			System.out.println("Enter a marks 0 to 100 between");
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getRoll() {
		return roll;
	}
	
	public double getMarks() {
		return marks;
	}
}

public class Encapsulation_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student_1 s1 = new Student_1();
		
		s1.setName("Arun Jadhav");
		s1.setRoll(112);
		s1.setMarks(80.65);
		
		System.out.println("Student Name: "+s1.getName());
		System.out.println("Student Roll: "+s1.getRoll());
		System.out.println("Student Marks: "+s1.getMarks());

	}

}
