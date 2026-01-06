package polymorphism_ex;

// Demonstrate polymorphism with inheritance.

class Demo {
	
	String name;
	
	Demo(String name){
		this.name = name;
	}
	
	public void demo() {
		System.out.println("I am "+name);
	}
}

class NewDemo extends Demo{
	
	NewDemo(String name){
		super(name);
	}
	
	@Override
	public void demo() {
		System.out.println(name+" is Police");
	}
}

public class Polymorphism_10 {

	public static void main(String[] args) {
		
		Demo d = new Demo("Arun");
		
		d.demo();
		
		Demo d1 = new NewDemo("Arun");
		d1.demo();

	}

}
