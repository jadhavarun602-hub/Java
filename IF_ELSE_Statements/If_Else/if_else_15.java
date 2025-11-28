package If_Else;

// Write a program to check if a person can get scholarship:
//If marks ≥ 90 → Full Scholarship
//Else if marks ≥ 75 → Half Scholarship
//Else → No Scholarship

import java.util.Scanner;

public class if_else_15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Marks: ");
        int mark = sc.nextInt();

        if (mark >= 90){
            System.out.println("You can get full Scholarship");
        } else if (mark >= 75) {
            System.out.println("You can get half Scholarship");
        }else {
            System.out.println("Sorry! No Scholarship");
        }
    }
}
