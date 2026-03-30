package constructors_ex;

//Use constructor to assign default values.

public class Constructors_23 {
	
	int id;
	String name;
	double salary;
	
	Constructors_23() {
		id = 12;
		name = "Karn";
		salary = 45000.65;
	}
	
     public void display() {
    	 System.out.println("Id: "+id+" Name: "+name+" Salary: "+salary);
     }

	public static void main(String[] args) {
		
		Constructors_23 c = new Constructors_23();
		c.display();
		

	}

}
