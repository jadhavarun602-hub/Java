package constructors_ex;

import java.util.Scanner;

//  Create constructor for BankAccount class.

class BankAccount {

	long account_no = 10000000000l;
	String password = "arun@2004";
	int balance;

	BankAccount(long account_no, String password, int balance) {
		this.account_no = account_no;
		this.password = password;
		this.balance = balance;
	}

	public void debitAmount(int amount) {
		if (balance >= amount) {
			balance = balance - amount;
			System.out.println("Debited Amount: " + amount);
		} else {
			System.out.println("Insufficient balance");
		}
	}

	public void creditAmount(int amount) {
		balance = balance + amount;
		System.out.println("Credited Amount: " + amount);
	}

	public void display() {
		System.out.println("Balance: " + balance);
		System.out.println("--------------------------");
	}
}

public class Constructors_21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		BankAccount b1 = new BankAccount(10000000000l,"arun@2004",0);

		b1.creditAmount(50000);
		b1.display();
		
		b1.debitAmount(12000);
		b1.display();
		
		b1.creditAmount(48399);
		b1.display();
	}

}
