package constructors_ex;

// Call one constructor from another using this().

class Person {
	
	String gender;
	String name;
	int age;
	String city;
	
	Person(String gender){
		this.gender = gender;
	}
	
	
	Person(String gender,String name,int age,String city){
		this(gender);
		this.name = name;
		this.age = age;
		this.city = city;
		
		System.out.println("Gender: "+gender);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("City: "+city);
		
	}
	
	
}

public class Constructors_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person("Female");
		Person p2 = new Person("Female","Pooja",21,"Pune");

	}

}
