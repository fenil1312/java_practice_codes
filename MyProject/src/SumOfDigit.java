import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// calculate sum of each digit of given number
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter minimum 2 digits number : ");
		int num = sc.nextInt();
		int digit, sum = 0;

		while (num > 0) {
			digit = num % 10;
			sum += digit;
			num = num / 10;
		}
		System.out.println("Sum of digits are  " + sum);

	}

}
