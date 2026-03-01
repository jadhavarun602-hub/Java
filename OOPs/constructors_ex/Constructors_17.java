package constructors_ex;

//  Use constructor to validate data.

class Data{
	
	int age;
	
	Data(int age){
		
		if(age >= 18) {
			this.age = age;
			System.out.println("Good! You can Vote..");
		}else {
			System.out.println("Sorry, you are not adult.");
		}
		
		
	}
}

public class Constructors_17 {

	public static void main(String[] args) {
		
		Data d = new Data(19);

	}

}
