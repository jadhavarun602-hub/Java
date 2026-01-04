package polymorphism_ex;

// Demonstrate method overloading.

class Sumation {
	
	public int sum(int a,int b) {
		return a + b;
	}
	
	public int sum(int a,int b,int c) {
		return a + b + c;
	}
}

public class Polymorphism_1 {

	public static void main(String[] args) {
		
		Sumation s1 = new Sumation();
		
		System.out.println("Sum of two num: "+s1.sum(23, 56));
		System.out.println("Sum of three num: "+s1.sum(45, 60, 94));
		

	}

}
