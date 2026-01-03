package encapsulation_ex;

// Demonstrate data hiding using encapsulation.

class Car {
	private String modelNo;
	
	Car(String modelNo){
		this.modelNo = modelNo;
	}
	
	public String getModelNo() {
		return modelNo;
	}
	
	
}

public class Encapsulation_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c1 = new Car("xyz123");
		
		System.out.println("Car Model: "+c1.getModelNo());
	}

}
