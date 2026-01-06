package abstraction_interface;

//Create an abstract class.

 interface Animal{
	 
String name();
String food();
	
}
 
 class Dog implements Animal{

	@Override
	public String name() {
	
		return "Dog";
	}

	@Override
	public String food() {
		
		return "Meat";
		
	}
	 
 }
 

public class Abstraction_1 {

	public static void main(String[] args) {
		
		Animal a = new Dog();
		
		
		System.out.println("Animal name is: "+a.name());
		System.out.println(a.name()+"'s food is: "+a.food());

		
	}

}
