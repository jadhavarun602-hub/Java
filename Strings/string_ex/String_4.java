package string_ex;

// Compare two strings using equals() and equalsIgnoreCase().

public class String_4 {
	
	public static void compareToString(String str1,String str2) {
		
		System.out.println("Using equals(): " + str1.equals(str2));
        System.out.println("Using equalsIgnoreCase(): " + str1.equalsIgnoreCase(str2));
	}

	public static void main(String[] args) {
		
		String string1 = "abc";
		String string2 = "abc";
		
		compareToString(string1,string2);

	}

}
