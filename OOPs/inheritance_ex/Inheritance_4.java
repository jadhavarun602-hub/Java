package inheritance_ex;
 
// Access parent class methods in child.

class Car {
	
	public void show() {
		System.out.println("Car is on the way..");
	}
}

class Engine extends Car{
	
	public void display() {
		show();
		System.out.println("car start with engine");
	}
}

public class Inheritance_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Engine e1 = new Engine();
		e1.display();
	}

}
