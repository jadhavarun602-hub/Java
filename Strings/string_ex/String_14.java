package string_ex;

// Replace all occurrences of a character with another character.

public class String_14 {
	
	public static void replaceCharacter(String ch) {
		
		char oldCh = 'a';
		char newCh = 'o';
		
		String result = "";
		
		for(int i = 0; i < ch.length(); i++) {
			
			if(ch.charAt(i) == oldCh) {
				result += newCh;
			}else {
				result += ch.charAt(i);
			}
		}
		
		System.out.println("old word: "+ch);
		System.out.println("new word: "+result);
		
	}

	public static void main(String[] args) {
		
		String str = "maam";
		
		replaceCharacter(str);
		

	}

}
