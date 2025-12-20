package arrays_ex;

import java.util.Scanner;

//Count the number of positive, negative, and zero elements.

public class Array_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Size: ");
		
		int size = sc.nextInt();
		
		int[] ele = new int[size];
		
		for(int i = 0; i < size; i++) {
			System.out.print("Enter a elements"+(i+1)+": ");
			ele[i] = sc.nextInt();
		}
		
		int CountPositive = 0;
		int CountNegative = 0;
		int CountZero = 0;
		
		for(int i = 0; i < ele.length;i++) {
			if(ele[i] < 0) {
				CountNegative++;
			}else if(ele[i] == 0){
				CountZero++;
			}else {
				CountPositive++;
			}
		}
		
		System.out.println("Counts Negative num: "+CountNegative);
		System.out.println("Counts Zero num: "+CountZero);
		System.out.println("Counts Positive num: "+CountPositive);

		sc.close();
	}

}
