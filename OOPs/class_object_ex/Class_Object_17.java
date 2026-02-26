package class_object_ex;

// Print object hashcode using object reference.

class Toy{
	
	String toy = "Doll";
	
}

public class Class_Object_17 {

	public static void main(String[] args) {
		
		Toy t = new Toy();
		Toy t2 = new Toy();
		
		System.out.println(t.hashCode());
		System.out.println(t2.hashCode());

	}

}
