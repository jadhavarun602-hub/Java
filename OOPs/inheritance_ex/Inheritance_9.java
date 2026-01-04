package inheritance_ex;

// Use super keyword to access parent constructor.

class S1 {
	private String name;
	private int id;

	S1(String name,int id){
		this.name = name;
		this.id = id;
	}
	
	public void show() {
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
	}
}

class S2 extends S1 {
	private String work;
	private double salary;
	
	S2(String name,int id,String work,double salary){
		super(name,id);
		this.work = work;
		this.salary = salary;
	}
	
	public void display() {
		super.show();
		System.out.println("Work: "+work);
		System.out.println("Salary: "+salary);
	}
}

public class Inheritance_9 {

	public static void main(String[] args) {
		
		S2 s = new S2("Arun",115,"Java developer",60000.45);
		s.display();
		
	}

}
