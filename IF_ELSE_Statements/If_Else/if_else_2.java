package If_Else;

// Write a program to check if a number is even or odd.

import java.util.Scanner;

public class if_else_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num : ");

        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println(num+" is Even Number");
        }else{
            System.out.println(num+" is Odd Number");
        }


    }
}
