package polymorphism_ex;

// Create parent reference for child object.

class Parent {

    public void reference() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {

    @Override
    public void reference() {
        System.out.println("Child class overridden method");
    }
}

public class Polymorphism_7 {

	public static void main(String[] args) {
		
		Parent p = new Child();
		p.reference();
		
		Parent p2 = new Parent();
		p2.reference();
		
	

	}

}
