package constructors_ex;

import java.util.Scanner;

// Create constructor for real-world class (Student).

class Collage{
	
	int id;
	String name;
	String department;
	
	Collage(int id,String name,String department){
		if((id > 0 && id <= 100) && department.equals("BCA")) {
            this.id = id;
            this.name = name;
            this.department = department;
            
            System.out.println("Student Added Successfully");
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Department: " + department);
        }
        else{
            System.out.println("Student not allowed in this college");
        }
	}
}

public class Constructors_20 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("Enter your ID: ");
		int id = sc.nextInt();
		
		System.out.println("Enter your Name: ");
		String name = sc.next();
		
		System.out.println("Enter your Department: ");
		String dep = sc.next();
		
		Collage c = new Collage(id,name.toUpperCase(),dep.toUpperCase());

	}

}
