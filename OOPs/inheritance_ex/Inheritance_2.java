package inheritance_ex;

// Demonstrate single inheritance.

class Parant {
	String msg = "prarant class";
	
	public void show() {
		System.out.println("This is a parant class method..");
	}
}

class Child extends Parant {
	String msg = "child class";
	
	@Override
	public void show() {
		System.out.println("This is a child class mehtod...");
	}
}

public class Inheritance_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parant p1 = new Parant();
		System.out.println(p1.msg);
		p1.show();
		
		System.out.println("-------------------------------------");
		
		Child c1 = new Child();
		System.out.println(c1.msg);
		c1.show();
		
	}

}
