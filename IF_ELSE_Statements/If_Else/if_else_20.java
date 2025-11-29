package If_Else;

// Write a program using switch to print whether a given character is a vowel or consonant.

import java.util.Scanner;

public class if_else_20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character : ");
        char ch = sc.next().charAt(0);

        switch (ch){
            case 'a','e','i','o','u','A','E','I','O','U' :
                System.out.println(ch+" is a Vowel");
                break;

            default:
               if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
                   System.out.println(ch+" is a consonant");
               }else {
                   System.out.println("Please Enter valid Character!");
               }
        }
    }
}
