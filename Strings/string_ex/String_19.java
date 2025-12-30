package string_ex;

// Reverse each word in a sentence.

public class String_19 {
	
	public static void reverseWord(String str) {
		
		String [] words = str.trim().split(" ");
		
		for(int i = 0; i < words.length; i++) {
			
			String ch = words[i];
			
			
			for(int j = ch.length()-1; j >= 0; j--) {
				
				System.out.print(ch.charAt(j));
			}
			
			System.out.print(" ");
		}
	}

	public static void main(String[] args) {
		String word = "I AM FROM PUNE";
		
		reverseWord(word);

	}

}
