package constructors_ex;

// Create constructor with access modifier.

public class Constructors_22 {
	
	public int age;
	public String name;
	
	public Constructors_22(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	public void display() {
		System.out.println("Age: "+age);
		System.out.println("Name: "+name);
	}

	public static void main(String[] args) {
		
		Constructors_22 c1 = new Constructors_22(21,"Arun");

		c1.display();
	}

}
