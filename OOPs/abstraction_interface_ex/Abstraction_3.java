package abstraction_interface_ex;

// Implement abstract method in child class.

interface Car {
	
	String getColor();
	int getModel();
}

class BMW implements Car{
	
	@Override
	public String getColor() {
		return "Red";
	}
	
	@Override
	public int getModel() {
		return 2022;
	}
}

public class Abstraction_3 {

	public static void main(String[] args) {
		
		Car car = new BMW();
		
		System.out.println("Car color: "+car.getColor());
		System.out.println("Car model: "+car.getModel());

	}

}
