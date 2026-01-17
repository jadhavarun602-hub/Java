package vector_stack_ex;

import java.util.Stack;

// Demonstrate LIFO behavior using Stack

public class Stack_7 {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		
		st.push(90);
		st.push(23);
		st.push(67);
		st.push(44);
		st.push(10);
		
	
		System.out.println("Peek the element: "+st.peek());
		System.out.println("Pop the element: "+st.pop());
		System.out.println("Stack: "+st);

	}

}
