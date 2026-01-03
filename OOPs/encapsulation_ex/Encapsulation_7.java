package encapsulation_ex;

// Restrict balance access in BankAccount class.

class BankAccount {
	private String user;
	private long accountNo;
	private long balance;
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public String getUser() {
		return user;
	}
	
	
	
	public void setAccount(long accountNo ) {
		if (String.valueOf(accountNo).length() >= 10) {
			this.accountNo = accountNo ;
		}else {
			System.out.println("Invalid account number...");
		}
	}
	
	public long getAccount() {
		return accountNo;
	}
	
	
	public void deposit(long amount) {
		if(amount > 0) {
			balance += amount;
		}else {
			System.out.println("Invalid amount...");
		}
	}
	
	
	public void withdraw(long amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
		}else {
			System.out.println("Insufficient balance or invalid amount");
		}
	}
	
	public void showBalance() {
		System.out.println("Balance: "+balance);
	}
}

public class Encapsulation_7 {

	public static void main(String[] args) {
		
		BankAccount ac1 = new BankAccount();
		
		ac1.setUser("Arun jadhav");
		ac1.setAccount(66666666666l);
		
		ac1.deposit(50000);
		ac1.withdraw(45000);
		ac1.deposit(74000);
		
		System.out.println("User name: "+ac1.getUser());
		System.out.println("Account No: "+ac1.getAccount());
		
		ac1.showBalance();
		

	}

}
