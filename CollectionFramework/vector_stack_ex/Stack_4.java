package vector_stack_ex;

import java.util.Stack;

// Check whether a Stack is empty.

public class Stack_4 {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<>();
		
		System.out.println("Stack is Empty: "+s.isEmpty());
		
		s.push(78);
		s.push(22);
		s.push(66);
		
		System.out.println("Stack: "+s);
		
		System.out.println("Stack is Empty: "+s.isEmpty());
	}

}
