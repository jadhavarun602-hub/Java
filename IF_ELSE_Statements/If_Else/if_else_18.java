package If_Else;

// Write a program using switch to check whether a given month has 28, 30, or 31 days.

import java.util.Scanner;

public class if_else_18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Month Number 1 to 12: ");
        int month = sc.nextInt();

        switch (month){
            case  1,3,5,7,8,10,12:
                System.out.println("31 Day in this Month");
                break;
            case 4,6,9,11 :
                System.out.println("30 Day in this Month");
                break;
            case 2 :
                System.out.print("Enter year : ");
                int year = sc.nextInt();
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                    System.out.println("29 Days in February (Leap Year)");
                } else {
                    System.out.println("28 Days in February");
                }
                break;
            default:
                System.out.println("please Enter valid number(1-12)");

        }
    }
}
