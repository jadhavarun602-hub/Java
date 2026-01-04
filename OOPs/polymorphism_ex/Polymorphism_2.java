package polymorphism_ex;

// Create overloaded methods with different parameters.

class Multiplication {
	
	public int multi(int a,int b) {
		return a * b;
	}
	
	public int multi(int a,int b,int c) {
		return a * b * c;
	}
}

public class Polymorphism_2 {

	public static void main(String[] args) {
		

		Multiplication m = new Multiplication();
		
		int multi1 = m.multi(4, 9);
		int multi2 = m.multi(5, 8, 3);
		
		System.out.println("Multiply two numbers: " + multi1);
		System.out.println("Multiply three numbers: " + multi2);
	}

}
