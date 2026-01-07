package abstraction_interface_ex;

// Implement interface in a class.

interface Bike {
	
	String bikeName();
	int price();
	void info();
	
}

class Royal implements Bike {

	@Override
	public String bikeName() {
		
		return "GT 650";
	}

	@Override
	public int price() {
		
		return 450000;
	}

	@Override
	public void info() {
		System.out.println("Bike details....");
		
	}
	
	
}

public class Abstract_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike b = new Royal();
		
		System.out.println("Bike name: "+b.bikeName());
		System.out.println("Bike price: "+b.price());

	}

}
