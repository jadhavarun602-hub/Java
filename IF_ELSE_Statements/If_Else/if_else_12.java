package If_Else;

// Write a program to check whether a character is uppercase, lowercase, digit, or special character.

import java.util.Scanner;

public class if_else_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z'){
            System.out.println(ch+" is UpperCase Character");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch+" is LowerCase Character");
        } else if (ch >= '0' && ch <= '9' )  {
            System.out.println(ch+" is Digit");
        }else {
            System.out.println(ch+" is Special Character");
        }
    }
}
