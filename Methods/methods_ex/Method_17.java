package methods_ex;

import java.util.Scanner;

//Create overloaded methods area() to calculate:
//area of a circle
//area of a rectangle
//area of a triangle

public class Method_17 {
	
	public static double area(double r) {
		
		return Math.PI * r * r;
	}
	
	public static double area(double l, double w , boolean isRect) {
				
		return l * w;
	}
	
	public static double area(double b, double h) {
		
		return 0.5 * b * h;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Radius: ");
		double r = sc.nextDouble();
		
		double circle = area(r);
		
		System.out.println("Area of Circle is: "+circle);
		System.out.println("-------------------------------------");
		
		System.out.print("Enter a Length: ");
		double l = sc.nextDouble();
		
		System.out.print("Enter a Width: ");
		double w = sc.nextDouble();
		
		double rectangle = area(l,w,true);
		
		System.out.println("Area of Rectangle is: "+rectangle);
		System.out.println("-------------------------------------");
		
		System.out.print("Enter a Base: ");
		double b = sc.nextDouble();
		
		System.out.print("Enter a Height: ");
		double h = sc.nextDouble();
		
		double triangle = area(b,h);
		
		System.out.println("Area of Triangle is: "+triangle);
		System.out.println("-------------------------------------");
		
		
	}

}
