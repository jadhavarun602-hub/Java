package If_Else;

// Write a program using switch to print the season (Winter, Summer, Monsoon, Autumn) based on month number.

import java.util.Scanner;

public class if_else_19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Month Number(1-12 : ");
        int month = sc.nextInt();

        switch (month){
            case 3,4,5 :
                System.out.println("Season : Summer");
                break;
            case  6,7,8 :
                System.out.println("Season : Monsoon");
                break;
            case 9,10 :
                System.out.println("Season : Autumn");
                break;
            case 11,12,1,2 :
                System.out.println("Season : Winter");
                break;
            default:
                System.out.println("Invalid Month! Please enter a number between 1 to 12.");
        }
    }
}
