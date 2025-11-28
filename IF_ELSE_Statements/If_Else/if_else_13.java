package If_Else;

// Write a program to check whether a given year is a century leap year.

import java.util.Scanner;

public class if_else_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        if (year % 400 == 0){
            System.out.println(year+" is a Century Leap Year");
        }else {
            System.out.println(year+" is Not a Century Leap Year");
        }
    }
}
