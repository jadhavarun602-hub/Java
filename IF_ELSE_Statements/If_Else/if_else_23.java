package If_Else;

// Write a program to check whether a person is eligible for a loan:
//Age ≥ 21
//Income ≥ 25,000
//CIBIL Score ≥ 700

import java.util.Scanner;

public class if_else_23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age: ");
        int age = sc.nextInt();

        if (age >= 21){
            System.out.println("Good! Your age is Eligible");
            System.out.println("----------------------------");
            System.out.print("Enter Your Income: ");
            int income = sc.nextInt();
            if (income >= 25000){
                System.out.println("Nice! Your Income is Eligible");
                System.out.println("----------------------------");
                System.out.print("Enter Your CIBIL Score: ");
                int cibil = sc.nextInt();
                if (cibil >= 700){
                    System.out.println("Congratulations! Your Loan is Approved");
                }else {
                    System.out.println("Loan Declined : CIBIL Score is too low");
                }
            }else {
                System.out.println("Loan Declined : Income must be at least ₹25,000.");
            }
        }else {
            System.out.println("Loan Declined : Minimum Age required is 21 years");
        }
    }
}
