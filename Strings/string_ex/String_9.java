package string_ex;

// Count the number of vowels and consonants in a string.

public class String_9 {

	public static void countVowelsConsonants(String word) {

		int vowels = 0;
		int consonants = 0;

		word = word.toLowerCase();
		
//		System.out.println(word);

		for (int i = 0; i < word.length(); i++) {

			char ch = word.charAt(i);

			if (ch >= 'a' && ch <= 'z') {

				if (ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			}
		}

		System.out.println("Vowels count: " + vowels);
		System.out.println("Consonants count: " + consonants);
	}

	public static void main(String[] args) {

		String str = "Arun Bhibhishan Jadhav ";

		countVowelsConsonants(str);
	}

}
