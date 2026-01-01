package class_object_ex;

// Demonstrate instance variables in a class.

class Bio {
	
	 String gender;
	 int age;
	 
	 
	 public void showInfo() {
		 System.out.println(gender+" "+age);
	 }
}

public class Class_Object_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bio b1 = new Bio();
		Bio b2 = new Bio();
		
		
		b1.gender = "Male";
		b1.age = 21;
		
		b2.gender = "Female";
		b2.age = 19;
		
		b1.showInfo();
		b2.showInfo();
		
		

	}

}
