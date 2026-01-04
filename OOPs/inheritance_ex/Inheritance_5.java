package inheritance_ex;

// Demonstrate multilevel inheritance.

class Univercity {
	
	public void show() {
		System.out.println("This is Univercity class...");
	}
}

class College_1 extends Univercity {
	
	public void display() {
		show();
		System.out.println("This is College class");
	}
}

class Student_1 extends College_1{
	
	public void info() {
		display();
		System.out.println("This is Student class..");
	}
}

public class Inheritance_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Univercity u = new Univercity();
		u.show();
		System.out.println("-----------------------");
		
		College_1 c = new College_1();
		c.display();
		System.out.println("-----------------------");
		
		Student_1 s = new Student_1();
		s.info();
		System.out.println("-----------------------");

	}

}
