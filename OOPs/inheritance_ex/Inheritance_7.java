package inheritance_ex;

// Demonstrate method overriding.

class Father {
	
	String surName;

	public void show() {
		System.out.println("Surname: "+surName);
		
	}
	
}

class Son extends Father {
	
	@Override
	public void show() {
		super.show();
		System.out.println("My Name is: Arun "+surName);
	}
}

public class Inheritance_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Son s = new Son();
		s.surName = "Jadhav";
		s.show();
	}

}
