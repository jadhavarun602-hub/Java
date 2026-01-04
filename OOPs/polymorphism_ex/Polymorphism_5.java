package polymorphism_ex;

// Demonstrate method overriding.

class Animal {
	
	public void sound() {
		System.out.println("Animal makes a sound...");
		
	}
}

class Dog extends Animal {
	
	@Override
	public void sound() {
		System.out.println("Dog's sound is bark bark...");
	}
}

public class Polymorphism_5 {

	public static void main(String[] args) {
		
		Animal a = new Dog();
		
		a.sound();

	}

}
