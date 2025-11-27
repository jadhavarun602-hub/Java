package If_Else;

//Write a program to check whether a given year is a leap year or not.

import java.util.Scanner;

public class if_else_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int year = sc.nextInt();

        if (year % 4 == 0){
            System.out.println(year+" is leap year");
        }else {
            System.out.println(year+" is not a leap year");
        }
    }
}
