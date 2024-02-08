package exception;

class WithdrawException extends Exception {

	WithdrawException(String msg) {
		super(msg);
	}

	WithdrawException() {
	}
}

class Account {
	void withdraw(int amount, int balance) throws WithdrawException {
		if (amount > balance) {
			throw new WithdrawException("Insufficient balance");
		} else {
			balance -= amount;
			System.out.println("Current balance : " + balance);
		}
	}
}

public class CustomExceptionDemo {

	public static void main(String[] args) {
		
		int amount = Integer.parseInt(args[0]);
		int balance = Integer.parseInt(args[1]);

		Account a = new Account();

		try {
			a.withdraw(amount, balance);
		} catch (Exception e) {
//			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
