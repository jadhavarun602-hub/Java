package class_object_ex;

// Demonstrate default values of instance variables.

class Movie{
	
	String movie;
	int release;
	String title;
	int time;
	
	public void show() {
		System.out.println(movie);
		System.out.println(release);
		System.out.println(title);
		System.out.println(time);
	}
}

public class Class_Object_23 {

	public static void main(String[] args) {
		
		Movie m = new Movie();
		m.show();

	}

}
