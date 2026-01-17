package vector_stack_ex;

import java.util.Stack;

// Implement push, pop, and peek operations using Stack.

public class Stack_8 {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		
		stack.push(90);
		stack.push(80);
		stack.push(70);
		stack.push(60);
		stack.push(50);
		stack.push(40);
		
		System.out.println("Stack: "+stack);
		
		System.out.println(stack.peek());
		stack.pop();
		
		System.out.println(stack.peek());
		stack.pop();
		
		System.out.println(stack.peek());

	}

}
