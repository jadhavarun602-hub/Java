package vector_stack_ex;

import java.util.Iterator;
import java.util.Stack;

// Display all elements of a Stack using a loop.

public class Stack_6 {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		
		st.push(90);
		st.push(80);
		st.push(70);
		st.push(60);
		st.push(50);
		st.push(40);
		
		Iterator<Integer> it = st.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
