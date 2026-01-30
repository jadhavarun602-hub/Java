package supplier_ex;

import java.util.function.Supplier;

// Create a real-world example where Supplier is useful (config values / IDs).

class Student{
	
	int id;
	String name;
	
	Student(int id , String name){
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Id : " + id + "\nName : " + name;
	}
	
	
}

public class Supplier_15 {

	public static void main(String[] args) {
		
		Supplier<Student> std1 = () -> new Student(1, "Arun");
		Supplier<Student> std2 = () -> new Student(2, "Nandkumar");
		System.out.println(std1.get());
		System.out.println(std2.get());

	}

}
