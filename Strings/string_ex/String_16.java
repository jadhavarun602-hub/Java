package string_ex;

// Count the number of words in a sentence.

public class String_16 {
	
	public static void countNum(String str) {
		
		if(str == null || str.trim().isEmpty()) {
			System.out.println("word count: 0");
			return;
		}
		
		String [] word = str.trim().split("\\s+");
		System.out.println("word count: "+word.length);
		
	}

	public static void main(String[] args) {
		
		String string = "I like java language";
		
		countNum(string);

	}

}
