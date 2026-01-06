package polymorphism_ex;

// Show dynamic method dispatch.

class Dispatch {

    public void dispatch() {
        System.out.println("This is parent class method...");
    }
}

class NewDispatch extends Dispatch {

    @Override
    public void dispatch() {
        System.out.println("This is child class method...");
    }
}

public class Polymorphism_8 {

	public static void main(String[] args) {
		
		Dispatch d = new NewDispatch();
		d.dispatch();

	}

}
