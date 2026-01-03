package encapsulation_ex;

// Create class with private variables.

class Bank {
	
	private String accountNo;
	
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	
	
}

public class Encapsulation_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b1 = new Bank();
		
		b1.setAccountNo("BKBK00345345433");
		
		System.out.println("Bank Account No: "+b1.getAccountNo());

	}

}
