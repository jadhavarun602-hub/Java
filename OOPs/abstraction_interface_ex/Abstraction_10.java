package abstraction_interface_ex;

// Demonstrate multiple inheritance using interfaces.

interface Animal_1 {
	
	String animalName();
	
	void info();
	
	
}

interface PetAnimal {
	
	String animalFood();
	int legs();
	
}

class NewAnimal implements PetAnimal, Animal_1{

	@Override
	public String animalName() {
		
		return "Cow";
	}

	@Override
	public String animalFood() {
		
		return "Grass";
	}

	@Override
	public int legs() {
		
		return 4;
	}

	@Override
	public void info() {
		System.out.println("Animal Name: "+animalName());
		System.out.println(animalName()+" Food: "+animalFood());
		System.out.println(animalName()+" Leg's is: "+legs());
	}
	
}

public class Abstraction_10 {

	public static void main(String[] args) {
		
		Animal_1 a = new NewAnimal();
		a.info();
	}

}
