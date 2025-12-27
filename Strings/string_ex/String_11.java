package string_ex;

// Reverse a string without using built-in reverse methods.

public class String_11 {
	
	public static void reverseString(String str) {
		
		String rev = "";
		
		for(int i = str.length()-1; i >= 0; i--) {
			
//			System.out.print(str.charAt(i));
			
			rev += str.charAt(i);
		}
		
		System.out.println("Original: "+str);
			System.out.println("Revers: "+rev);
	}

	public static void main(String[] args) {
		

		String word = "Jadhav";
		
		reverseString(word);
		
		
	}

}
