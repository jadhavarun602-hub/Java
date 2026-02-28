package class_object_ex;

// Demonstrate default values of instance variables.

class Movie{
	
	String movie;
	int release;
	String title;
	
	public void show() {
		System.out.println(movie);
		System.out.println(release);
		System.out.println(title);
	}
}

public class Class_Object_23 {

	public static void main(String[] args) {
		
		Movie m = new Movie();
		m.show();

	}

}
