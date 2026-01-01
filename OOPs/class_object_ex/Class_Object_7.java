package class_object_ex;

// Show difference between instance and local variables.

class Bike {
	
	String bikeName;
	String speed;
	
	public void show() {
		String engine = "648cc";
		
		System.out.println("Bike Name: "+bikeName);
		System.out.println("Speed: "+speed);
		System.out.println("Engine: "+engine);
	}
}

public class Class_Object_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		
		b1.bikeName = "GT650";
		b1.speed = "170kmph";
		
		b2.bikeName = "MT15";
		b2.speed = "150kmph";
		
		b1.show();
		b2.show();

	}

}
