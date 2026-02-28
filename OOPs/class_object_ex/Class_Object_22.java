package class_object_ex;

// Create a class and print object reference.

class Temp1{
	
	String name = "Arun";
	int age = 22;
	
	public void info() {
		System.out.println("My name is "+name+" and my age is "+age);
	}
}

public class Class_Object_22 {

	public static void main(String[] args) {
		
			Temp1 t = new Temp1();
			
			System.out.println(t);
		
	

	}

}
