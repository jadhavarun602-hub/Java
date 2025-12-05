package loops_ex;

// Print all odd numbers between 1 and 50 using a loop.

public class Loops_4 {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 50; i++) {
			
			if(i % 2 != 0) {
				
				System.out.println(i);
			}
		}

	}

}
