package If_Else;

//Write a program to find the largest of two numbers.

import java.util.Scanner;

public class if_else_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();


        if(num1 > num2){
            System.out.println(num1+" is largest number");
        } else if (num1 < num2) {
            System.out.println(num2+" is largest number");
        }else {
            System.out.println(num1+" and "+num2+" is same number");
        }

    }
}
