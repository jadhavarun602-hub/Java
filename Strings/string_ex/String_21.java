package string_ex;

// Count the frequency of each character in a string.

public class String_21 {
    
    public static void countFrequency(String str) {
        
        int[] frequency = new int[256]; 

        
        for (int i = 0; i < str.length(); i++) {
        	
            char ch = str.charAt(i);
            
            frequency[ch]++; 
        }

        
        System.out.println("Character frequency in: " + str);
        
        for (int i = 0; i < 256; i++) {
        	
            if (frequency[i] > 0) {
            	
                System.out.println("'" + (char) i + "': " + frequency[i]);
            }
        }
    }

    public static void main(String[] args) {
        String character = "programming";
        countFrequency(character);
    }
}
