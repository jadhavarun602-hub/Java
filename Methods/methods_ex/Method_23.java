package methods_ex;

// Write a static method to generate a random number between 1 and 100.

public class Method_23 {
	
	public static int generateRandomNum() {
		
		int num = (int) (Math.random()*100) + 1;
		
		return num;
	}

	public static void main(String[] args) {
		
		int RandomNumber = generateRandomNum();
		
		System.out.println("Random Number: "+RandomNumber);
		

	}

}
