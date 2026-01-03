package encapsulation_ex;

// Create read-only class using only getters.

class Instagram {
	private String id;
	private String password;
	
	public Instagram(String id,String password) {
		this.id = id;
		this.password = password;
	}
	
	public String getId() {
		return id;
	}
	
	public String getPassword() {
		return password;
	}
}

public class Encapsulation_5 {

	public static void main(String[] args) {
		
		Instagram insta = new Instagram("arunjadhav4327","arun123");
		
		
		System.out.println("Instagram Id: "+insta.getId());
		System.out.println("Instagram Pass: "+insta.getPassword());

	}

}
