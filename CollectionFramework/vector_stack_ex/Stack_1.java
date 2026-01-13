package vector_stack_ex;

import java.util.Stack;

// Create a Stack and push elements into it.

public class Stack_1 {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		
		st.push(78);
		st.push(90);
		st.push(12);
		st.push(56);
		st.push(55);
		
		
		System.out.println("Stack elements: "+st);

	}

}
