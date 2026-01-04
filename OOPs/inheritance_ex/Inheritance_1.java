package inheritance_ex;

//Create parent and child class.

class Animal {
	String animalName;
	int legs;
	
	public Animal(String animalName,int legs) {
		this.animalName = animalName;
		this.legs = legs;
	}
	
	public void show() {
		System.out.println("Animal Name: "+animalName);
		System.out.println(animalName+" legs: "+legs);
	}
}

class Dog extends Animal {
	String sound;
	String food;

	public Dog(String animalName, int legs , String sound,String food) {
		super(animalName, legs);
		this.sound = sound;
		this.food = food;
		
	}
	
	public void show() {
		super.show();
		System.out.println(animalName+" Sound: "+sound);
		System.out.println(animalName+" Food: "+food);
		System.out.println("------------------------------------");
	}

}

public class Inheritance_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Animal d1 = new Dog("Dog",4,"Bark", "Meat");
		d1.show();
	

	}

}
