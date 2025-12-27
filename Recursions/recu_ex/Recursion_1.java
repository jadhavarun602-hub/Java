package recu_ex;

// Write a recursive method to print numbers from 1 to n

public class Recursion_1 {
	
	public static void printNum(int n) {
		
		if(n == 0) {
			
			return;
		}
		
	printNum(n-1);
	
	System.out.print(n+" ");
		
		
	}

	public static void main(String[] args) {
		

		int num = 10;
		
		printNum(num);
		
	}

}
