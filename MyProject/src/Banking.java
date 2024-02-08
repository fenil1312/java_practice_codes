import java.util.Scanner;

public class Banking {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int option;
		System.out.print("Enter current balance : ");
		double currentBalance = sc.nextDouble();

		do {
			System.out.println("\n1. Deposit" + "\n2. Withdraw" + "\n3. Display Balance" + "\n4. Exit");
			System.out.print("Please choose one option : ");
			option = sc.nextInt();

			switch (option) {
			case 1:
				System.out.print("Enter amount : ");
				double deposit = sc.nextDouble();
				currentBalance += deposit;
				break;
			case 2:
				System.out.print("Enter amount : ");
				double withdraw = sc.nextDouble();
				currentBalance -= withdraw;
				break;
			case 3:
				System.out.println("\n➡️ Total balance is " + currentBalance);
				break;
			case 4:
				System.out.println("Thank you for banking...🙏");
				break;
			default:
				System.out.println("invalid option..!");
			}
		} while (option != 4);
	}

}
