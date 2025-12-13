package methods_ex;

//Write a method to count vowels in a string.

public class Method_20 {
	
	public static int countVowel(String name) {
		
		int count = 0;
		
		for(int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||
			   ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
			{
				count++;
			}
		}
		
		return count;
		
		
	}

	public static void main(String[] args) {
		
		
		String student = "Arun Jadhav";
		
		int result = countVowel(student);
		
		System.out.println("total count: "+result);

	}

}
