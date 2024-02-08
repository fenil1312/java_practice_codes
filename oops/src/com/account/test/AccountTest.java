package com.account.test;

import com.account.Account;

public class AccountTest {

	public static void main(String[] args) {

		Account a1 = new Account(1,"saving",11000);
		a1.display();
		a1.deposit(3000);
		a1.withdraw(2000);
		
	}

}
