package inheritance_ex;

// Use super keyword to access parent method.

class C1 {
	
	String msg;
	
	public C1(String msg) {
		this.msg = msg;
	}
	
	public void display() {
		System.out.println("MSG: "+msg);
	}
}

class C2 extends C1 {
	
	String note;
	
	public C2 (String msg, String note) {
		super(msg);
		this.note = note;
	}
	
	public void info() {
		super.display();
		System.out.println("Note: "+note);
	}
	
}

public class Inheritance_8 {

	public static void main(String[] args) {
		
		C2 c = new C2("Hey c2","hello c1");
		c.info();

	}

}
