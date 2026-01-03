package encapsulation_ex;

//  Access private variables using getters.

class Student
{
	private int id;
	private String name;
	 
	 
	public void setId(int id) {
		this.id = id;
	}
	
	 public int getId() {
		return id;
		 
	 }
	 
	 public void setName(String name) {
		 this.name = name;
	 }
	 
	 public String getName() {
		 return name;
	 }
	 
//	 public void info() {
//		 System.out.println("Student Id: "+id);
//		 System.out.println("Student Name: "+name);
//	 }
	
	
}

public class Encapsulation_2 {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.setId(111);
		s1.setName("Arun Jadhav");
		
		System.out.println("Student Id (Getter): " + s1.getId());
		System.out.println("Student Name (Getter): " + s1.getName());
		
		
	}

}
