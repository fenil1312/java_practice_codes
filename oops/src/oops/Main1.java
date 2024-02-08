package oops;

class Account {

	int accountNo;
	String accountType;
	int accountBalance;

	Account(int accountNo, String accountType, int accountBalance) { // this is a parameterized constructor
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	
	Account(){} // this is a default constructor
	/*
	 it is the responsibility of the programmer to create default constructor if they 
	 created parameterized constructor.
	 */

	void setAccountDetails(int accountNo, String accountType, int accountBalance) {
		this.accountNo = accountNo;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}

	void withdraw(int withdrawAmount) {
		accountBalance -= withdrawAmount;
	}

	void deposit(int depositAmount) {
		accountBalance += depositAmount;
	}

	void dispAccountDetails() {
		System.out.println("Account number : " + accountNo);
		System.out.println("Account Type : " + accountType);
		System.out.println("Account Balance : " + accountBalance);
	}
}

public class Main1 {

	public static void main(String[] args) {

		Account a1 = new Account(23185494, "saving", 5000);
//		a1.setAccountDetails(23185494, "saving", 5000);
		a1.withdraw(1000);
		a1.deposit(500);
		a1.dispAccountDetails();

		System.out.println();

		Account a2 = new Account();
		a2.setAccountDetails(123455, "current", 2500);
		a2.withdraw(250);
		a2.deposit(500);
		a2.dispAccountDetails();
	}

}