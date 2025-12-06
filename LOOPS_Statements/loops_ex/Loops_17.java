package loops_ex;

// Print the Fibonacci series up to n terms using a loop.

public class Loops_17 {

    public static void main(String[] args) {
        
        int a = 0;
        int b = 1;
        
        System.out.print(a + " , " + b + " , ");
        
        for (int i = 2; i <= 10; i++) {
            
            int c = a + b;
            
            System.out.print(c + " , ");
            
            a = b;
            b = c;
        }

    }

}
