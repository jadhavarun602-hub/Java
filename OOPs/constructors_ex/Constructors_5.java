package constructors_ex;

// Create multiple constructors in a class.

class Hotel {
	
	String name;
	int staff;
	String bestFood;
	String location;
	double price;
	
	Hotel(String name){
		this.name = name;
	}
	
	Hotel (int staff , String bestFood){
		this.staff = staff;
		this.bestFood = bestFood;
	}
	
	Hotel(String location,double price){
		this.location = location;
		this.price = price;
	}
	
	Hotel(String name,int staff,String bestFood,String location,double price){
		this.name = name;
		this.staff = staff;
		this.bestFood = bestFood;
		this.location = location;
		this.price = price;
	}
	
	public void Info() {
		System.out.println("Hotel name: "+name);
		System.out.println("Hotel Staff: "+staff);
		System.out.println("Best Item: "+bestFood);
		System.out.println("Location: "+location);
		System.out.println("Price: "+price);
		System.out.println("----------------------------------------");
	}
}

public class Constructors_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hotel h1 = new Hotel("PK Biryani",23,"Dum Biryani","Warje",150.23);
		h1.Info();
		
		Hotel h2 = new Hotel("Tirnga",15,"Special mutton thali","Dharashiv",250.5);
		h2.Info();

	}

}
