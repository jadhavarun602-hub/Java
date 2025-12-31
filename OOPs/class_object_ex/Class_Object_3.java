package class_object_ex;

//Create multiple objects of the same class with different values.

class Animal{
	
	String name;
	String food;
	String sound;
	int legs;
	
	public void Display() {
		System.out.println("Animal Name: "+name);
		System.out.println("Animal Food: "+food);
		System.out.println("Animal Sound: "+sound);
		System.out.println("Animal legs: "+legs);
		System.out.println("___________________________");
	}
}

public class Class_Object_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a1 = new Animal();
		a1.name = "COW";
		a1.food = "Grass";
		a1.sound = "Moos or lows";
		a1.legs = 4;
		a1.Display();
		
		Animal a2 = new Animal();
		a2.name = "DOG";
		a2.food = "meat";
		a2.sound = "Barks";
		a2.legs = 4;
		a2.Display();
		
		Animal a3 = new Animal();
		a3.name = "CHIKEN";
		a3.food = "seeds";
		a3.sound = "Clucks,";
		a3.legs = 2;
		
		a3.Display();

	}

}
