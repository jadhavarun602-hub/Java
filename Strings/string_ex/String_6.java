package string_ex;

// Print each character of a string using a loop.

public class String_6 {
	
	public static void printCharacter(String str) {
		
		for(int i = 0; i < str.length(); i++) {
			
			System.out.println(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		
		String string = "Arun jadhav";
		
		printCharacter(string);

	}

}
