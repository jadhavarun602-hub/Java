package If_Else;

// Write a program to check whether a person is eligible to vote (age ≥ 18).

import java.util.Scanner;

public class if_else_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();

        if (age >= 18){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }
    }
}
