package constructors_ex;

// Demonstrate constructor chaining.

class Demo{
	
	Demo(){
		this(10);
		System.out.println("Default constructor");
	}

    Demo(int i) {
		this(10,20);
		System.out.println("Single parameter constructor");
	}
    
    Demo(int i, int j){
       	System.out.println("Double parameter constructor");
    }
}

public class Constructors_16 {

	public static void main(String[] args) {
		
		Demo d = new Demo();

	}

}
