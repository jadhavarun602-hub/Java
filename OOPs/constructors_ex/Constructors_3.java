package constructors_ex;

// Initialize variables using constructor.

class Student_1 {
	
	String name;
	String std;
	int roll;
	
	Student_1(String name,String std,int roll){
		this.name = name;
		this.std = std;
		this.roll = roll;
	}
	
	public void show(){
		System.out.println("Name: "+name);
		System.out.println("Std: "+std);
		System.out.println("Roll: "+roll);
	}
}

public class Constructors_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student_1 s1 = new Student_1("Arun","12th",111);
		s1.show();

	}

}
