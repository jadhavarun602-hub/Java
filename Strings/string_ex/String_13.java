package string_ex;

// Remove all whitespaces from a string.

public class String_13 {
	
	public static void removeWhitespace(String str) {
		
		String ch = "";
		
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) != ' ') {
				ch += str.charAt(i);
			}
		}
		
		System.out.println(ch);
	}

	public static void main(String[] args) {
		
		String s = "arun jadhav";
		
		removeWhitespace(s);

	}

}
