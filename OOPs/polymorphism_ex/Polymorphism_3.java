package polymorphism_ex;

// Create overloaded methods with different data types.

class Statements {
	
	public double sum(double a , double b) {
		return a + b;
	}
	
	public int sum(int a, int b) {
		return a + b;
	}
}

public class Polymorphism_3 {

	public static void main(String[] args) {
		
		Statements s = new Statements();
		
		System.out.println("Sum: "+s.sum(45.5, 55.5));
		System.out.println("Sum: "+s.sum(55, 45));

	}

}
