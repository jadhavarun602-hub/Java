package constructors_ex;

// Create class without constructor (default constructor).

class Temper{
    
    int num;
    
    public void show(){
        System.out.println("Number = " + num);
    }
}

public class Constructors_18 {

    public static void main(String[] args) {
        
        Temper t = new Temper(); // default constructor
        t.show();

    }

}
