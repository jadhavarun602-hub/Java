package set_examples;

import java.util.Stack;

public class Set_Int {

	public static void main(String[] args) {
		
		
		Stack<String> book = new Stack<>();
		
		book.add("Bhagavat Gita");
		book.add("Marathi");
		book.add("Hindi");
		book.add("English");
		
		System.out.println(book.peek());
		System.out.println(book);

	}

}
