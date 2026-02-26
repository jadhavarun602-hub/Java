package class_object_ex;

// Demonstrate memory allocation for objects.

class Memory{
	
	int num;
	
	Memory(){
		num =15;
		System.out.println("object num: "+num);
	}
	
}

public class Class_Object_13 {

	public static void main(String[] args) {
		
		
		Memory m = new Memory();
		m.num = 23;
		
		System.out.println("update number: "+m.num);

	}

}
