package string_ex;

// Find the first occurrence of a character in a string.

public class String_7 {
	
	public static void findOccurrence(String str) {
		
		char ch = 'a';
		
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ch) {
				System.out.println("First occurrence of '" + ch + "' is at index: " + i);
                return;
			}
		}
		
		System.out.println("character not found");
	}

	public static void main(String[] args) {
		
		String string = "nandkumar";
		
		findOccurrence(string);
		

	}

}
