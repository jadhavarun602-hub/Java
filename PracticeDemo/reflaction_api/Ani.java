package reflaction_api;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;


class Animal{
	
	private String name;
	private int legs;
	
	Animal(){
		
	}
	
	Animal(String name){
		
	}
	
	private Animal(String name,int legs){
		this.name = name;
		this.legs = legs;
		System.out.println("Object created...");
	}

	@Override
	public String toString() {
		return "Animal [name = " + name + ", legs = " + legs + "]";
	}
	
	
	
}

public class Ani {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class<?> cl = Class.forName("reflaction_api.Animal");
		
		Constructor<?>[] co = cl.getDeclaredConstructors();
		
		for(Constructor<?> con : co ) {
			System.out.println(con);
			System.out.println("........................................");
		}
		
		System.out.println("-------------------------------------------------");
		
		Field [] fields = cl.getDeclaredFields();
		
		for(Field field : fields) {
			System.out.println("Field Name: "+field.getName());
			System.out.println("Field Type: "+field.getType());
			System.out.println("Access Modifier: "+field.getModifiers());
			System.out.println("-----------------------------------------------");
		}
		
	
		Constructor<?> constructor = cl.getDeclaredConstructor(String.class,int.class);
		
		constructor.setAccessible(true);
		
	   Animal animal = (Animal) constructor.newInstance("Dog",4);
		
		System.out.println(animal.toString());
		

	}

}
