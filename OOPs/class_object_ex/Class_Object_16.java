package class_object_ex;

// Create a class and store object reference in another variable

class Temp{
	
	String str = "Hello";
	
	Temp(){
		System.out.println(str+" i am Arun...");
	}
}

public class Class_Object_16 {

	public static void main(String[] args) {
		
		Temp t = new Temp();
		
		Temp t2 = t;
		
		t2.str = "Hey";
		
		System.out.println(t.str);
		System.out.println(t2.str);

	}

}
