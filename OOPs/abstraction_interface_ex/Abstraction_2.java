package abstraction_interface_ex;

// Create abstract method in abstract class.

abstract class College {
	
	abstract String collegeName();
	abstract String address();
	
	public void info() {
		System.out.println("This is college information");
	}
}

class Student extends College{

	@Override
	String collegeName() {
	
		return "SMC";
	}

	@Override
	String address() {
		
		return "Kothrud";
	}
	
}

public class Abstraction_2 {

	public static void main(String[] args) {
		
		Student c = new Student();
		
		c.info();
		System.out.println("College name: "+c.collegeName());
		System.out.println("College address: "+c.address());

	}

}
