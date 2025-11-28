package If_Else;

// Write a program to input three numbers and check if they can form a triangle (sum of any two sides > third side).

import java.util.Scanner;

public class if_else_14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter Third Number: ");
        int num3 = sc.nextInt();

        if (num1 + num2 > num3 && num1 + num3 > num2 && num2 + num3 > num1){
            System.out.println("The numbers can form a triangle.");
        }else {
            System.out.println("The numbers cannot form a triangle.");
        }
    }
}
