package If_Else;

// Write a program to check if a number is positive or negative.

import java.util.Scanner;

public class if_else_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = sc.nextInt();

        if (num < 0){
            System.out.println(num+" Number is Negative");
        } else if (num == 0) {
            System.out.println(num+" Number is Zero");
        }else {
            System.out.println(num+" Number is Positive");
        }


    }
}
