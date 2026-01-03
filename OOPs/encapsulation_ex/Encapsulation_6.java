package encapsulation_ex;

// Create write-only class using only setters.

class Instagarm_1 {
	private String id;
	private String password;
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}

public class Encapsulation_6 {

	public static void main(String[] args) {
		
		Instagarm_1 in1 = new Instagarm_1();
		
		in1.setId("arunjadhav123");
		in1.setPassword("arun1234");

	}

}
