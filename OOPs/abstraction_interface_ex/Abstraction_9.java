package abstraction_interface_ex;

// Create multiple methods in interface.

interface Phone {
	
	String phoneName();
	int phoneModel();
	double phonePrice();
	
	default void phoneInfo()
		{
			System.out.println("Phone Name: "+phoneName());
			System.out.println("Phone Model: "+phoneModel());
			System.out.println("Phone Price: "+phonePrice());
		}
	
	void phoneNetwork();
}

class NewPhone implements Phone{

	@Override
	public String phoneName() {
		return "Realme";
	}

	@Override
	public int phoneModel() {
		
		return 2022;
	}

	@Override
	public double phonePrice() {
		
		return 25000.00;
	}

	@Override
	public void phoneNetwork() {
		System.out.println(phoneName() + " phone (Model " + phoneModel() +
				") priced at " + phonePrice() +
				" is a good and affordable phone.");
	}
	
}

public class Abstraction_9 {

	public static void main(String[] args) {
		
		Phone p = new NewPhone();
		p.phoneInfo();
		System.out.println();
		p.phoneNetwork();
	}

}
