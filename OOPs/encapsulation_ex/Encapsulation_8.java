package encapsulation_ex;

// Validate data inside setter method.

class VoterId{
	private String username;
	private int age;
	private String email;
	
	public void setUserName(String username) {
		if(username != null && username.length() > 4) {
			this.username = username;
		}else {
			System.out.println("Invalid username..");
		}
	}
	
	public void setAge(int age) {
		if(age >= 18 && age <= 60) {
			this.age = age;
		}else {
			System.out.println("Age must be between 18 and 60..");
		}
	}
	
	public void setEmail(String email) {
		if(email.contains("@") && email.contains(".")) {
			this.email = email;
		}else {
			System.out.println("please enter valid email");
		}
	}
	
	public String getUserName() {
		return username;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getEmail() {
		return email;
	}
}

public class Encapsulation_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VoterId v1 = new VoterId();
		
		v1.setUserName("Arun jadhav");
		v1.setAge(21);
		v1.setEmail("arun@gmail.com");
		
		System.out.println("User Name: "+v1.getUserName());
		System.out.println("User Age: "+v1.getAge());
		System.out.println("User Email: "+v1.getEmail());

	}

}
