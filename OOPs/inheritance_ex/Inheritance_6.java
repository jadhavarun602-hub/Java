package inheritance_ex;

// Create three-level inheritance structure.

class Police {
	
    public void show() {
        System.out.println("I am police");
    }
}

class IPS extends Police {
	
    public void display() {
        show();
        System.out.println("I am IPS Police");
    }
}

class Dharashiv extends IPS {
	
    public void info() {
        display();
        System.out.println("I am Dharashiv IPS police");
    }
}

public class Inheritance_6 {

    public static void main(String[] args) {

        Dharashiv d = new Dharashiv();
        d.info();
    }
}
