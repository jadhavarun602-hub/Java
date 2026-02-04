package reflection_ex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// Write a program to obtain the Class object using Class.forName()


class Person{
	
	String name;
	int age;
	String gender;
	
	public Person(){
		System.out.println("i am noramal constructor...");
	}
	
	public Person(String name,int age){
		this.name = name;
		this.age = age;
		
		System.out.println("two parameter object created");
	}
	
	public Person(String name,int age,String gender){
		this.name = name;
		this.age = age;
		this.gender = gender;
		
		System.out.println("three parameter object created");
	}
}

public class Reflection_1 {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Class<?> c = Class.forName("reflection_ex.Person");
		
		Constructor<?>[] con = c.getDeclaredConstructors();
		
		for(Constructor<?> a : con) {
			System.out.println(a);
			System.out.println("---------------------------------------------------------------");
		}
		
		Constructor<?> cc = c.getConstructor();
		Constructor<?> cp = c.getConstructor(String.class,int.class);
		Constructor<?> cl = c.getConstructor(String.class,int.class,String.class);
		
		cc.setAccessible(true);
		cp.setAccessible(true);
		cl.setAccessible(true);
		
		Person pp = (Person)cc.newInstance();
		System.out.println(pp.getClass());
		
		System.out.println("--------------------------------------------------");
		
		Person p1 = (Person)cp.newInstance("Nandkumar",23);
		System.out.println(p1.name+" : "+p1.age);
		
		System.out.println("--------------------------------------------------");
		
		Person p2 = (Person)cl.newInstance("Arun",21,"Male");
		System.out.println(p2.name+" : "+p2.age+" : "+p2.gender);

	}

}
