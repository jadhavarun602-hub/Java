package inheritance_ex;

// Show constructor calling in inheritance.

class Fruit {
	protected String name;
	private String test;

	public Fruit(String name,String test) {
		this.name = name;
		this.test = test;
	}
	
	public void info() {
		System.out.println(name+" is "+test);
	}
}

class Apple extends Fruit {
	
	private String color;
	
	public Apple(String name,String test,String color) {
		super(name,test);
		this.color = color;
	}
	
	public void display() {
		super.info();
		System.out.println(name+" color is: "+color);
	}
}

public class Inheritance_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Apple a = new Apple("Apple","Sweet","Red");
		a.display();

	}

}
