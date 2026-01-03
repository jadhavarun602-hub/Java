package constructors_ex;

// Create a class with parameterized constructor.

class Student {
	
	Student(String name, int roll){
		System.out.println("Name: "+name);
		System.out.println("Roll: "+roll);
	}
}

public class Constructors_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("Arun", 111);

	}

}
