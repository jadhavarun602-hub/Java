package If_Else;

// Write a program to accept a date (day, month, year) and check whether it is a valid date.

import java.util.Scanner;

public class if_else_24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Date : ");
        int day = sc.nextInt();

        System.out.print("Enter Month : ");
        int month = sc.nextInt();

        System.out.print("Enter Year : ");
        int year = sc.nextInt();


        if (month < 1 || month > 12){
            System.out.println("Invalid Date! Month must be between 1 and 12");
        }

        int dayInMonth;

        switch (month){
            case 2 :
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                    dayInMonth = 29;
                }else {
                    dayInMonth = 28;
                }
                break;
            case 1,3,5,7,8,10,12 :
                dayInMonth = 31;
                break;
            case 4,6,9,11 :
                dayInMonth = 30;
                break;
            default:
                dayInMonth = 31;
        }

        if (day > 0 && day <= dayInMonth){
            System.out.println("Valid Date : "+day+" /"+month+" /"+year);
        }else {
            System.out.println("Invalid Date! Day must be between 1 and "+dayInMonth);
        }
    }
}
