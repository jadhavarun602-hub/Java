package string_ex;

// Count the number of digits and special characters in a string.

public class String_10 {
	
	public static void countDigit(String digit) {
		
		int c = 0;
		int n = 0;
		int s = 0;
		
		digit = digit.toLowerCase();
		
		for(int i = 0; i < digit.length(); i++) {
			
			char ch = digit.charAt(i);
			
			if(ch >= 'a' && ch <= 'z') {
				c++;
			}else if(ch >= '0' && ch <= '9') {
				n++;
			}else {
				s++;
			}
		}
		
		System.out.println("character: "+c);
		System.out.println("number: "+n);
		System.out.println("special character: "+s);
	}

	public static void main(String[] args) {
		

		String str = "ehfehfgewfuegt47t783443n@&%bbbb@bb*";
		
		countDigit(str);
	}

}
