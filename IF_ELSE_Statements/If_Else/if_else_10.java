package If_Else;

// Write a program to calculate electricity bill using conditions:
//up to 100 units → 1.5 per unit
//101–200 units → 2 per unit
//above 200 units → 3 per unit

import java.util.Scanner;

public class if_else_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Unit: ");
        int unit = sc.nextInt();

        if (unit > 200){
            System.out.println("Your electricity bill is: "+unit*3);
        } else if (unit >= 101 && unit <= 200) {
            System.out.println("Your electricity bill is: "+unit*2);
        }else {
            System.out.println("Your electricity bill is: "+unit*1.5);
        }
    }
}
