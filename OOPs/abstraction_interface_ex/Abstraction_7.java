package abstraction_interface_ex;

// Create interface in Java.

interface Pen {
	
	abstract String color();
	abstract double price();
	
	public abstract void info();
}

class CelloPen implements Pen {

	@Override
	public String color() {
		
		return "Blue";
	}

	@Override
	public double price() {
		
		return 8.6;
	}

	@Override
	public void info() {
		System.out.println("Pen color: "+color());	
		System.out.println("Pen price: "+price());
	}
	
	
}

public class Abstraction_7 {

	public static void main(String[] args) {
		
		Pen p = new CelloPen();
		
		p.info();

	}

}
