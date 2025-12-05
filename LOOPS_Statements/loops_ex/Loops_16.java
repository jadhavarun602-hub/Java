package loops_ex;

import java.util.Scanner;

//Find the LCM (Least Common Multiple) of two numbers using loops.

public class Loops_16 {

 public static void main(String[] args) {
     
     Scanner sc = new Scanner(System.in);
     
     System.out.print("Enter First Num: ");
     int num1 = sc.nextInt();
     
     System.out.print("Enter Second Num: ");
     int num2 = sc.nextInt();
     
     int gcd = 1;
     
     int max = (num1 < num2) ? num1 : num2;
     
     // Find GCD
     for(int i = 1; i <= max; i++) {
         if(num1 % i == 0 && num2 % i == 0) {
             gcd = i;
         }
     }
     
     // LCM formula
     int lcm = (num1 * num2) / gcd;
     
     System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
     System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

 }

}
