package class_object_ex;

// Create a class with only methods (no variables).

class World{
	
	public static void wind() {
		System.out.println("wind is wind");
	}
	
	public static void sun() {
		System.out.println("sun is bright");
	}
	
	public static void rain() {
		System.out.println("rain is water");
	}
}

public class Class_Object_20 {

	public static void main(String[] args) {
		
		World w = new World();
		w.wind();
		w.sun();
		w.rain();
	}

}
