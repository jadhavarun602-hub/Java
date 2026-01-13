package vector_stack_ex;

import java.util.Stack;

// Pop an element from the Stack.

public class Stack_2 {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		
		st.push(89);
		st.push(44);
		st.push(88);
		st.push(12);
		st.push(34);
		st.push(99);
		
		System.out.println("Before: "+st);
		System.out.println(st.pop());
		System.out.println("After: "+st);

	}

}
