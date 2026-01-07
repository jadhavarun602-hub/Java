package abstraction_interface_ex;

// Demonstrate abstraction using real-world example.

abstract class App {
	private String email;
	private String password;
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public abstract void login();
	
}

class LoginApp extends App {
	
	public void login() {
		if(getEmail().equals("arun@gmail.com") && getPassword().equals("arun123")) {
			System.out.println("Login successful");
		}else {
			System.out.println("Login failed");
		}
	}
}


public class Abstraction_6 {

	public static void main(String[] args) {
		
		App a = new LoginApp();
		a.setEmail("arun@gmail.com");
		a.setPassword("arun133");
		
		a.login();
	}

}
