package reflaction_api;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Employee{
	
	String name;
	double salary;
	
    public Employee() {
		
	}
    
    public Employee(String name) {
		
	}

	private Employee(String name,double salary) {
		this.name = name;
		this.salary = salary;
		
		System.out.println("Object is Created...");
	}	
	
}


public class NewClass {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		
		Class<?> cl = Class.forName("reflaction_api.Employee");
		
		Constructor<?>[] co = cl.getDeclaredConstructors();
		
		for(Constructor<?> c : co) {
			
			System.out.println(c);
			System.out.println("__________________________________________________");
		}
		
		Constructor<?> cs = cl.getDeclaredConstructor(String.class,double.class);
		
		System.out.println("...............................................................");
		
//		System.out.println(cs);
		
		cs.setAccessible(true);
		
		Employee emp = (Employee) cs.newInstance("Arun Jadhav",567889);
		
		System.out.println(emp.name+" : "+emp.salary);
		
	
	}

}
