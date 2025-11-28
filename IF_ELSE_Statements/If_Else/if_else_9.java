package If_Else;

// Write a program to assign a grade (A, B, C, D, F) based on marks

import java.util.Scanner;

public class if_else_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your mark: ");
        int mark = sc.nextInt();

        if (mark >= 86 && mark <= 100){
            System.out.println("Grade : A");
        } else if (mark >= 71 && mark <= 85 ) {
            System.out.println("Grade : B");
        } else if (mark >= 56 && mark <= 70) {
            System.out.println("Grade : C");
        } else if (mark >= 40 && mark <= 55) {
            System.out.println("Grade : D");
        }else{
            System.out.println("Grade : F");
        }


    }
}
