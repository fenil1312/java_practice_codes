package oops;

class Customer {
	int custId;
	String custName, custAddress;

	Customer(int custId, String custName, String custAddress) {
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
	}

	Customer() {
	}

	void display() {
		System.out.println("Customer Id : " + custId);
		System.out.println("Customer Name : " + custName);
		System.out.println("Customer Address : " + custAddress);
	}

}

class AccountDetails extends Customer {
	int accId;
	String accType;
	int accBalance;

	AccountDetails(int custId, String custName, String custAddress, int accId, String accType, int accBalance) {
		super(custId, custName, custAddress);
		this.accId = accId;
		this.accType = accType;
		this.accBalance = accBalance;
	}

	void display() {
		System.out.println();
		System.out.println("Account Id : " + accId);
		System.out.println("Account Type : " + accType);
		super.display();
		System.out.println("Account Balance : " + accBalance);
	}

}

public class AccountTest {

	public static void main(String[] args) {
		Customer c1 = new Customer(01, "Fenil", "Patan");
		c1.display();

		AccountDetails a1 = new AccountDetails(2, "Yashvi", "Patan", 2, "saving", 70000);
		a1.display();

	}

}