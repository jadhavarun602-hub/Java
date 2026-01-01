package class_object_ex;

// Create a class with default values and print them.

class Laptop {
	
	String laptopName;
	double price;
	String company;
	
	
	public void display() {
		System.out.println("Company: "+company);
		System.out.println("Laptop Name: "+laptopName);
		System.out.println("Price: "+price);
		
	}
}

public class Class_Object_8 {

	public static void main(String[] args) {
		
		Laptop l1 = new Laptop();

		l1.display();
		

	}

}
