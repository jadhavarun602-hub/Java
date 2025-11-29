package If_Else;

// Write a program using switch to print the day of the week (1 → Sunday, 2 → Monday, etc.).

import java.util.Scanner;

public class if_else_16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER DAY OF WEEK 1 TO 7 : ");
        int day = sc.nextInt();

        switch (day){
            case 1 :
                System.out.println("Sunday");
                break;
            case 2 :
                System.out.println("Monday");
                break;
            case 3 :
                System.out.println("Tuesday");
                break;
            case 4 :
                System.out.println("Wednesday");
                break;
            case 5 :
                System.out.println("Thursday");
                break;
            case 6 :
                System.out.println("Friday");
                break;
            case 7 :
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day! Enter number between 1 to 7.");
        }
    }
}
