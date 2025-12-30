package string_ex;

// Find the longest word in a sentence.

public class String_17 {

	public static void main(String[] args) {
		
		String str = "I AM A ARUN JADHAV";
		
		String[] word = str.trim().split(" ");
		
		String longWord = "";
		
		for(int i = 0; i < word.length;i++) {
			
			if(word[i].length() > longWord.length() ) {
				longWord = word[i];
			}
		}
		
		System.out.println("Longest word: "+longWord);
		System.out.println("Longest length: "+longWord.length());
	}

}
