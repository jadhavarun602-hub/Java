package class_object_ex;

// Create a class with multiple methods and call them.

class Biker{
	
	 public void race() {
	        System.out.println("Bike is racing fast...");
	    }

	    public void horn() {
	        System.out.println("Bike horn is sounding...");
	    }

	    public void refuel() {
	        System.out.println("Bike is refueling...");
	    }
}

public class Class_Object_14 {

	public static void main(String[] args) {
		
		Biker b = new Biker();
		
		b.race();
		b.horn();
		b.refuel();

	}

}
