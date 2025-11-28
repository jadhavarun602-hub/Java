package If_Else;

// Write a program to check whether a given number is positive, negative, or zero.

import java.util.Scanner;

public class if_else_8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        if (num == 0){
            System.out.println("Given number is ZERO");
        } else if (num < 0) {
            System.out.println("Given number is NEGATIVE");
        }else{
            System.out.println("Given number is POSITIVE");
        }

    }
}
