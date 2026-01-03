package constructors_ex;

// Use this keyword inside constructor.

class Id{
	
	String name;
	String address;
	String DOB;
	Long number;
	
	Id(String name,String address,String DOB,long number){
		
		this.name = name;
		this.address = address;
		this.DOB = DOB;
		this.number = number;
		
		System.out.println("Name: "+this.name);
		System.out.println("Address: "+this.address);
		System.out.println("DOB: "+this.DOB);
		System.out.println("Contact: "+this.number);
	}
}

public class Constructors_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Id id1 = new Id("Arun","Pargaon","01/05/2004",8830347948l);

	}

}
