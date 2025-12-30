package string_ex;

// Check whether two strings are anagrams.

public class String_20 {
	
	public static boolean checkAnagrams(String s1,String s2) {
		
		s1.replace(" ", "").toLowerCase();
		s2.replace(" ", "").toLowerCase();
		
		if(s1.length() != s2.length()) {
			
			return false;
		}
		
		int [] frq = new int[26];
		
		for(int i = 0; i < s1.length(); i++) {
			frq[s1.charAt(i) - 'a']++;
			frq[s2.charAt(i) - 'a']--;
		}
		
		for(int ch : frq) {
			if(ch != 0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		String str1 = "silent";
		String str2 = "listen";
		
		if(checkAnagrams(str1,str2)) {
			System.out.println("Strings are Anagrams");
		}else {
			System.out.println("String are not Anagrams");
		}

	}

}
