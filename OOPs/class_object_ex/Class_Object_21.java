package class_object_ex;

// Create an object inside another method.

class Parent{
	
	public void show() {
		System.out.println("I am parent class method..");
	}
}


public class Class_Object_21 {
	
	public void display() {
		Parent p = new Parent();
		p.show();
	}
	
	public static void main(String[] args) {
		
		Class_Object_21 cb = new Class_Object_21();
		
		cb.display();
		
		
		

	}

}
