package class_object_ex;

// Create a class and use it in multiple classes.

class A{
	
	public void show() {
		System.out.println("I am A class");
	}
}

class B{
	
	public void show() {
		A a = new A();
		a.show();
		System.out.println("I am B class");
	}
}

class C{
	
	public void show() {
		B b = new B();
		b.show();
		System.out.println("I am C class");
	}
}

public class Class_Object_24 {

	public static void main(String[] args) {
	
		C c = new C();
		c.show();

	}

}
