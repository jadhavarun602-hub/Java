package constructors_ex;

// Print values initialized by constructor.

class Animal {
	String name;
	int legs;
	String food;
	
	Animal (String name,int legs,String food){
		this.name = name;
		this.legs = legs;
		this.food = food;
	}
	
	public void display() {
		System.out.println("Animal name: "+name);
		System.out.println(name+" legs: "+legs);
		System.out.println(name+" food: "+food);
		System.out.println("---------------------------------");
	}
}

public class Constructors_4 {
	
	public static void main(String [] args) {
		
		Animal a1 = new Animal("Dog",4,"Meat");
		Animal a2 = new Animal("Chiken",2,"Seeds");
		Animal a3 = new Animal("Cow",4,"Grass");
		
		a1.display();
		a2.display();
		a3.display();
		
	}

}
