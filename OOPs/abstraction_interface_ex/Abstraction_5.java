package abstraction_interface_ex;

// Use abstract class reference.

abstract class Person {
	
	abstract String state();
	abstract String address();
	abstract int pincode();
}

class NewPerson extends Person{

	@Override
	String state() {
		
		return "MH";
	}

	@Override
	String address() {
		
		return "Dharashiv";
	}

	@Override
	int pincode() {
		
		return 413526;
	}
	
}

public class Abstraction_5 {

	public static void main(String[] args) {
		
		Person p = new NewPerson();
		
		System.out.println("State: "+p.state());
		System.out.println("Address: "+p.address());
		System.out.println("Pincode: "+p.pincode());
	

	}

}
