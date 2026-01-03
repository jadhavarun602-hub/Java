package constructors_ex;

// Create constructor with one argument.

class Pen {
	
	String color;
	
	Pen(String color){
		this.color = color;
	}
	
	void show() {
		System.out.println("Pen color: "+color);
	}
}

public class Constructors_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pen pen = new Pen("Black");

		pen.show();
	}

}
