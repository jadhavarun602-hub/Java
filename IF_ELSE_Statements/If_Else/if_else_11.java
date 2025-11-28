package If_Else;

// Write a program to check whether a person is eligible to donate blood (age ≥ 18 and weight ≥ 50).

import java.util.Scanner;

public class if_else_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();

        if (age >= 18){
            System.out.println("Grate! Your age is eligible\n");
            System.out.print("Please Enter your Weight: ");
            int weight = sc.nextInt();
            if (weight >= 50){
                System.out.println("Good! You are eligible to donate blood");
            }else {
                System.out.println("Sorry! Your weight is Not eligible");
            }
        }else {
            System.out.println("Sorry! Your age is Not eligible");
        }
    }
}
