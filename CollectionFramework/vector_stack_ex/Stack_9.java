package vector_stack_ex;

import java.util.Stack;

// Reverse a string using Stack.

public class Stack_9 {

	public static void main(String[] args) {
		
		String str = "Arun";
		
		Stack<Character> st = new Stack<>();
		
		for(char ch : str.toCharArray()) {
			st.push(ch);
		}
		
		StringBuilder rev = new StringBuilder();
		
		while(!st.isEmpty()) {
			rev.append(st.pop());
		}
		
		
		System.out.println("Original String: "+str);
		
		System.out.println("Reversed String: "+rev);
	}

}
