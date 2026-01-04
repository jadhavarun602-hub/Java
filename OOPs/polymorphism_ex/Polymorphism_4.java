package polymorphism_ex;

//Demonstrate compile-time polymorphism.

class Calculator {

    
    public int add(int a, int b) {
        return a + b;
    }

   
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    
    public double add(double a, double b) {
        return a + b;
    }
}

public class Polymorphism_4 {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("Add two ints: " + c.add(10, 20));
        System.out.println("Add three ints: " + c.add(10, 20, 30));
        System.out.println("Add two doubles: " + c.add(10.5, 20.5));
    }
}



