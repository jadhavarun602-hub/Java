package If_Else;

// Write a program to check if a given character is a vowel or consonant.

import java.util.Scanner;

public class if_else_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            System.out.println(ch+" is a vowel");
        }else if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
            System.out.println(ch+" is a constant");
        }else{
            System.out.println("please enter a character");
        }
    }

}
