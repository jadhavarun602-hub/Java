package constructors_ex;

// Create object using non-parameterized constructor.

class House{
	
	String house_name;
	int house_no;
	String city;
	
	House(){
		this.house_name = house_name;
		this.house_no = house_no;
		this.city = city;
	}
	
	public void print() {
		System.out.println("House Name: "+house_name);
		System.out.println("House No: "+house_no);
		System.out.println("City: "+city);
		System.out.println("------------------------");
	}
	
}

public class Constructors_13 {

	public static void main(String[] args) {
		
		House h1 = new House();
		h1.house_name = "Sai villa";
		h1.house_no = 15;
		h1.city = "Pune";
		
		House h2 = new House();
		h2.house_name = "Ashirvad";
		h2.house_no = 111;
		h2.city = "Mumbai";
		
		h1.print();
		h2.print();
		
		

	}

}
