package If_Else;

// Write a program to check whether a given number is a palindrome (121, 1331, etc.).

import java.util.Scanner;

public class if_else_21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

       int original = num;
       int rev = 0;

       while (num > 0){
           int digit = num % 10;
           rev = rev * 10 + digit;
           num = num / 10;
       }

       if (original == rev){
           System.out.println(original+" is Palindrome number");
       }else {
           System.out.println(original+" is Not a Palindrome number");
       }

    }
}
