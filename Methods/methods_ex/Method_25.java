package methods_ex;

import java.util.Scanner;

//Write a recursive method to find the nth Fibonacci number.

public class Method_25 {


 public static int findFibonacci(int n) {

   
     if (n == 0) {
         return 0;
     }
     if (n == 1) {
         return 1;
     }

 
     return findFibonacci(n - 1) + findFibonacci(n - 2);
 }

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter a Num: ");
     int num = sc.nextInt();

     int result = findFibonacci(num);
     System.out.println("Fibonacci number at position " + num + " is: " + result);

     sc.close();
 }
}
