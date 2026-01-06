package polymorphism_ex;

// Override method and change behavior.


class Behavior {

    public void behavior() {
        System.out.println("Parent behavior");
    }
}

class ChangeBehavior extends Behavior {

    @Override
    public void behavior() {
        System.out.println("Child behavior ");
    }
}

public class Polymorphism_9 {

	public static void main(String[] args) {
		
		Behavior b = new ChangeBehavior();
		
		b.behavior();

	}

}
