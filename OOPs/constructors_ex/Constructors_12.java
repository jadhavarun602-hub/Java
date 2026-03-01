package constructors_ex;

// Show constructor execution order.

class Cars{
	String carname;
	int model;
	String power;
	int price;
	
	Cars(String carname){
		System.out.println("1st constructor");
		this.carname = carname;
	}
	
	Cars(String carname,int model){
		this(carname);
		System.out.println("2nd constructor");
		this.model = model;
	}
	
	Cars(String carname,int model,String power,int price){
		this(carname,model);
		System.out.println("3rd constructor");
		this.power = power;
		this.price = price;
	}
	
	public void info() {
//		System.out.println("Car Name: "+carname);
//		System.out.println("Model: "+model);
//		System.out.println("Power: "+power);
//		System.out.println("Price: "+price);
//		System.out.println("---------------------------");
	}
}

public class Constructors_12 {

	public static void main(String[] args) {
		
		Cars c = new Cars("Nano");
		Cars c1 = new Cars("Swift",2025);
		Cars c2 = new Cars("BMW",2026,"10000HP",25000000);
		
		c.info();
		c1.info();
		c2.info();

	}

}
