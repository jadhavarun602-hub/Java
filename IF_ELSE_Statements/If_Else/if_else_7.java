package If_Else;

//Write a program to find the largest of three numbers

import java.util.Scanner;

public class if_else_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a Second Number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter a Third Number: ");
        int num3 = sc.nextInt();


        if (num1 > num2 && num1 > num3){
            System.out.println(num1+" is largest number");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2+" is largest number");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println(num3+" is largest number");
        }else {
            System.out.println("All numbers are same");
        }
    }
}
