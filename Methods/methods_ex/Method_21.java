package methods_ex;

//Write a method to find the frequency of a character in a string.

public class Method_21 {
	
	public static int findFrequency(String n, char tar) {
		
		int count = 0;
		
		for(int i = 0; i < n.length(); i++) {
			
			if(n.charAt(i) == tar) {
				count++;
			}
		}
		
		return count;
	}

    
    
    public static void main(String[] args) {
    	
    	String text = "my name is arun jadhav";
    	char ch = 'a';
    	
    	int find = findFrequency(text,ch);
    	
    	System.out.println("The Frequency of '" + ch + "': " + find);

    }
}

