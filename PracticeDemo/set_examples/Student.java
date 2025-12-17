package set_examples;

import java.util.TreeSet;

public class Student implements Comparable<Student>{
	
	String name;
	int marks;
	
	public Student(int marks,String name) {
		this.marks = marks;
		this.name = name;
	}
	
	@Override
	public String toString() {
	    return name + " : " + marks;
	}


	
	@Override
	public int compareTo(Student o) {
		
		return Integer.compare(this.marks, o.marks);
	}
	
	
	public static void main(String[] args) {
		
		Student std1 = new Student(50000,"Arun");
		Student std2 = new Student(45000,"Riya");
		Student std3 = new Student(34000,"Pooja");
		Student std4 = new Student(98000,"Nandu");
		
		TreeSet<Student> std = new TreeSet<Student>();
		
		std.add(std1);
		std.add(std2);
		std.add(std3);
		std.add(std4);
		
		System.out.println(std);
		
		
		
		
//		System.out.println(std1.compareTo(std2));

	}

	

}
