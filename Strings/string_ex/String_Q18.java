package string_ex;

// Find the shortest word in a sentence.

public class String_Q18 {

	public static void main(String[] args) {
		
		String str = "I AM GOOD BOY";
		
		String [] word = str.trim().split(" ");
		
		String shortest = word[0];
		
		for(int i = 0; i < word.length; i++) {
			
//			char ch = str.charAt(i);
//			
//			System.out.print(ch);
			
			if(word[i].length() < shortest.length()) {
				shortest = word[i];
			}
		}
		
		System.out.println("Shortest : "+shortest);
		System.out.println("Lenght : "+shortest.length());
		

	}

}
