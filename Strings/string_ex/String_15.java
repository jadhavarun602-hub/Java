package string_ex;

// Remove duplicate characters from a string.

public class String_15 {
	
	public static void removeDuplicate(String str) {
		
		 String result = "";

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            
	            if (result.indexOf(ch) == -1) {
	                result += ch;
	            }
	        }

	        System.out.println("After removing duplicates: " + result);
	    }

	public static void main(String[] args) {
		
		String s = "jadhav";
		
		removeDuplicate(s);

	}

}
