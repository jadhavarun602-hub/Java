package vector_stack_ex;

import java.util.Stack;

// Reverse a number using Stack.

public class Stack_10 {
	
	 public static void main(String[] args) {

		 int num = 1234;
		 int temp = num;
		 int rev = 0;

		 Stack<Integer> st = new Stack<>();

		 while (temp > 0) {
		     st.push(temp % 10);
		     temp /= 10;
		 }

		 while (!st.isEmpty()) {
		     rev = rev * 10 + st.pop();
		 }
		 
		 System.out.println("Original number: " + num); 
		 System.out.println("Reversed number: "+rev);

	    }
	}