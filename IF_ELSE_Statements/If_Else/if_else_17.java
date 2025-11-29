package If_Else;

// Write a program using switch to perform a simple calculator (addition, subtraction, multiplication, division).

import java.util.Scanner;

public class if_else_17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Num: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second Num: ");
        int num2 = sc.nextInt();

        System.out.println("1: Addition , 2: Subtraction, 3: Multiplication, 4: Division");
        int calculator = sc.nextInt();

        switch (calculator){
            case 1 :
                System.out.println(num1+" + "+num2+" = "+(num1+num2));
                break;
            case 2 :
                System.out.println(num1+" - "+num2+" = "+(num1-num2));
                break;
            case 3 :
                System.out.println(num1+" * "+num2+" = "+(num1*num2));
                break;
            case 4 :
                if (num2 == 0){
                    System.out.println("Error! Division by Zero not Allowed");
                }else {
                    System.out.println(num1+" / "+num2+" = "+(num1/num2));
                }
                break;
            default:
                System.out.println("Please enter a valid choice (1-4).");
        }
    }
}
