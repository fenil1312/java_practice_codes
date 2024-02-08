import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers you have..! : ");
		int n = sc.nextInt();
		int num[] = new int[n];
		int sum = 0;

		for (int i = 0; i < num.length; i++) {
			System.out.print("Enter number " + (i + 1) + " : ");
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.print("Sum of given numbers are " + sum);
	}

}
