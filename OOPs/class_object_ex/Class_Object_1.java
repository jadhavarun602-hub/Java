package class_object_ex;

// Create a simple class and object in Java.

class Student{
	
	String name;
	int roll;
	
	public void Info() {
		System.out.println("Name: " + name);
        System.out.println("Roll no: " + roll);
	}
}

public class Class_Object_1 {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name = "Arun";
		s1.roll = 111;
		
		s1.Info();

	}

}
