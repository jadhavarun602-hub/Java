package constructors_ex;

// Compare constructor vs method initialization.

class Information{
	String name ;
	String gender;
	int age;
	
	Information(String name,String gender,int age){
		this.name = name;
		this.gender = gender;
		this.age = age;	
	}
	
	public void setInfo(String name,String gender,int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Gender: "+gender);
		System.out.println("Age: "+age);
		System.out.println("--------------------------");
	}
}

public class Constructors_14 {

	public static void main(String[] args) {
		
		Information info = new Information("Arun","Male",22);
		info.display();
		
		Information info2 = new Information("","",0);
		info2.name = "Pooja";
		info2.gender = "Female";
		info2.age = 20;
		
		info2.display();

	}

}
