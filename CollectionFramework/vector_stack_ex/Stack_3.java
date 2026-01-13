package vector_stack_ex;

import java.util.Stack;

// Peek the top element of the Stack

public class Stack_3 {

	public static void main(String[] args) {
		
		Stack<Integer> ele = new Stack<>();
		
		ele.push(79);
		ele.push(22);
		ele.push(11);
		ele.push(90);
		ele.push(45);
	
		System.out.println("Stack ele: "+ele);
		System.out.println(ele.peek());

	}

}
