package constructors_ex;

// Show constructor is called automatically.

class Test{

    Test(){
        System.out.println("Constructor called");
    }

    void show(){
        System.out.println("Method called");
    }
}

public class Constructors_19{

    public static void main(String[] args){

        Test t = new Test();
        t.show();

    }
}