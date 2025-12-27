package string_ex;

// Find the last occurrence of a character in a string.

public class String_8 {
	
	public static void lastOccurance(String str) {
		
		char ch = 'a';
		
		for(int i = str.length()-1; i >= 0; i--) {
			if(str.charAt(i) == ch) {
				System.out.println("Last occurrence of '" + ch + "' is at index: " + i);
				return;
			}
		}
		
		System.out.println("character not found");
		
	}

	public static void main(String[] args) {
		

		String name = "nandkumar";
		
		lastOccurance(name);
	}

}
