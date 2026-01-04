package polymorphism_ex;

// Demonstrate runtime polymorphism.

class Table{
	
	public void table(int a) {
		
		System.out.println("This is parent class: Acending order");
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i+" X "+a+" = "+(a*i));
		}
	}
}

class NewTable extends Table{
	
	public void table(int a) {
		System.out.println("This is child class: descending order");
		
		for(int i = 10; i >= 1; i--) {
			System.out.println(i+" X "+a+" = "+(a*i));
		}
	}
}

public class Polymorphism_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Table t1 = new NewTable();
		t1.table(5);
	}

}
