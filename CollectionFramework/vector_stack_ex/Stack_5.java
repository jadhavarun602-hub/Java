package vector_stack_ex;

import java.util.Stack;

// Search for an element in a Stack.

public class Stack_5 {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(99);
		stack.push(77);
		stack.push(55);
		stack.push(33);
		stack.push(11);
		
		int search = stack.search(55);
		
		if(search != -1) {
			System.out.println("element found at position: "+search);
		}else {
			System.out.println("element not found");
		}

	}

}
