package If_Else;

// Write a program to check whether a given number is an Armstrong number (153, 9474, etc.).

import java.util.Scanner;

public class if_else_22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();;

        int original = num;
        int count = 0;


        int temp = num;
        while (temp > 0){
            temp /= 10;
            count++;
        }

        int sum = 0;
        while (num > 0){
            int digit = num % 10;
            sum += Math.pow(digit,count);
            num /= 10;
        }

        if (original == sum) {
            System.out.println(original+" is an an Armstrong number");
        }else {
            System.out.println(original+" is Not an an Armstrong number");
        }

//        This is only 3 digit armstrong check

//        int num = sc.nextInt();
//        int original = num;
//        int sum = 0;
//
//        while (num > 0){
//            int digit = num % 10;
//            sum = sum + (digit * digit * digit);
//            num = num / 10;
//        }
//
//        if (original == sum){
//            System.out.println(original+" is an Armstrong number");
//        }else {
//            System.out.println(original+" is Not an Armstrong number");
//        }
    }
}
