package class_object_ex;

// Create a class with only variables (no methods).

class Only{
	String name = "Arun";
	int age = 22;
}

public class Class_Object_19 {

	public static void main(String[] args) {
		
		Only o = new Only();
		
		System.out.println(o.name);
		System.out.println(o.age);

	}

}
