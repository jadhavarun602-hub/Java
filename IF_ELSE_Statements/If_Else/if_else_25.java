package If_Else;

// Write a program to determine the type of triangle (Equilateral, Isosceles, Scalene) based on side lengths.

import java.util.Scanner;

public class if_else_25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Side 1 : ");
        int a = sc.nextInt();

        System.out.print("Enter Side 2 : ");
        int b = sc.nextInt();

        System.out.print("Enter Side 3 : ");
        int c = sc.nextInt();

        // Check if three sides form a valid triangle
        if (a + b > c && a + c > b && b + c > a) {

            if (a == b && b == c) {
                System.out.println("Equilateral Triangle");
            }
            else if (a == b || b == c || a == c) {
                System.out.println("Isosceles Triangle");
            }
            else {
                System.out.println("Scalene Triangle");
            }

        } else {
            System.out.println("Not a Valid Triangle");
        }
    }
}
