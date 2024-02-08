package com.account;

public class Account {

	public int accId;
	public String accType;
	public double accBalance;

	public Account(int accId, String accType, double accBalance) {
		this.accId = accId;
		this.accType = accType;
		this.accBalance = accBalance;
	}

	public void deposit(int amount) {
		System.out.println("Deposit amount : " + amount);
		accBalance += amount;
		System.out.println("Account Balance : " + accBalance);
		System.out.println();
	}

	public void withdraw(int amount) {
		System.out.println("Withdraw amount : " + amount);
		accBalance -= amount;
		System.out.println("Account Balance : " + accBalance);
		System.out.println();
	}

	public int getBalance() {

		return 0;
	}

	public void display() {
		System.out.println("Account Id : " + accId);
		System.out.println("Account Type : " + accType);
		System.out.println("Account Balance : " + accBalance);
		System.out.println();
	}
}
