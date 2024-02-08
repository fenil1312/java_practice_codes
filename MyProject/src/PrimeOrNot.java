import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		int check = 0;

		if (num == 0 || num == 1) {
			System.out.print("Number is not prime");
		}

		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				check = 1;
				break;
			}
		}
		if (check == 1) {
			System.out.print("Number is not prime");
		} else {
			System.out.print("Number is prime");
		}
	}
}
