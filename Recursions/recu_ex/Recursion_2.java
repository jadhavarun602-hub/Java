package recu_ex;

//Write a recursive method to print numbers from n to 1.

public class Recursion_2 {
	
	public static void printNum(int n) {
		
		if(n == 0) {
			return;
		}
		
		System.out.print(n+" ");
		
		printNum(n-1);
	}

	public static void main(String[] args) {
		
		int num = 10;
		
		printNum(num);

	}

}
