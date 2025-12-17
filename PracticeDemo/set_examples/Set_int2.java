package set_examples;

import java.util.Stack;

public class Set_int2 {

	public static void main(String[] args) {
		
	Stack<Object> car = new Stack<>();
	
	car.add("BMW");
	car.add("audi");
	car.add(null);
	car.add("Bugati");
	car.add("Defender");
	car.add("Mustang");
	car.add("Spender");
	car.add("Bugati");
	car.add("Swift");
	
	System.out.println(car.pop());
	System.out.println(car);

	}

}
