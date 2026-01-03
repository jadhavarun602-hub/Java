package constructors_ex;

 // Demonstrate constructor overloading

class Home {
	
	String name;
	String location;
	int pincode;
	
	Home(){
		System.out.println("This is defult constructor...");
	}
	
	Home(String name){
		this.name = name;
		System.out.println("House Name: "+name);	
		System.out.println("---------------------------------");
	}
	
	Home(String name,String location){
		this.name = name;
		this.location = location;
		System.out.println("House Name: "+name);
		System.out.println("House Location: "+location);
		System.out.println("---------------------------------");
	}
	
	Home(String name,String location,int pincode){
		this.name = name;
		this.location = location;
		this.pincode = pincode;
		System.out.println("House Name: "+name);
		System.out.println("House Location: "+location);
		System.out.println("House Pincode: "+pincode);
		System.out.println("---------------------------------");
	}
	
}

public class Constructors_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Home h1 = new Home("Om Sai Ram");
		Home h2 = new Home("Vrundavan","Pune");
		Home h3 = new Home("Radhe","Pargaon",413526);
		

	}

}
