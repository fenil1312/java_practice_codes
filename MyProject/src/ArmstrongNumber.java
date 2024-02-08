
import java.util.Scanner;

public class ArmstrongNumber {

	public static boolean isArmstrong(int num) {

		String n = Integer.toString(num);
		int sum = 0;
		while (num > 0) {
			int mod = num % 10;
			double power = Math.pow(mod, n.length());
			sum += power;
			num /= 10;
		}
		if (sum == Integer.parseInt(n)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Number is an armstrong or not...");
		System.out.print("\nEnter Number : ");
		int n = sc.nextInt();

		if (isArmstrong(n)) {
			System.out.println(n + " is an armstrong number.");
		} else {
			System.out.println(n + " is not an armstrong number.");
		}

		// Armstrong number from 0 - 999
		System.out.println("\nArmstrong number from 0 - 999 : ");
		int sum1 = 0;
		for (Integer i = 0; i < 1000; i++) {
			if (isArmstrong(i)) {
				System.out.print(i + " ");
			}
		}
	}
}
