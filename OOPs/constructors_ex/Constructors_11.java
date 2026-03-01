package constructors_ex;

// c

class Bike{
	String bikename;
	int model;
	double price;
	
	Bike(String bikename,int model,double price){
		this.bikename = bikename;
		this.model = model;
		this.price = price;
	}
	
	public void display() {
		System.out.println("Bike Name: "+bikename);
		System.out.println("Model: "+model);
		System.out.println("Price: "+price);
		System.out.println("------------------------------");
	}
}

public class Constructors_11 {

	public static void main(String[] args) {
		
		Bike b = new Bike("GT650",2025,450000.50);
		Bike b2 = new Bike("ZX10R",2026,2220000.50);
		
		b.display();
		b2.display();

	}

}
