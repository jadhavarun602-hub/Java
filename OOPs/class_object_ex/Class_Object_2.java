package class_object_ex;

// Create a class with two variables and print them using an object.

class Car {
	String Color;
	String Name;
	double Price;
	
	public void Display() {
		System.out.println("Car Name: "+Name);
		System.out.println("Car color is: "+Color);
		System.out.println("Car price is: "+Price);
	}
}

public class Class_Object_2 {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.Name = "BMW M5";
		c1.Color = "Red";
		
		c1.Price = 4500000.88;
		
		c1.Display();

	}

}
