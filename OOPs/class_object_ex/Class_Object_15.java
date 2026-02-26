package class_object_ex;

// Create a class and access methods from main().

class NewClass{
	
	public void demo() {
		System.out.println("Hii i am demo method");
	}
}

public class Class_Object_15 {

	public static void main(String[] args) {
		
		NewClass n = new NewClass();
		
		n.demo();
		

	}

}
