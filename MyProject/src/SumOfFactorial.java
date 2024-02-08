import java.util.Scanner;

public class SumOfFactorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		int facto = 1;
		int sum = 0;

		for (int i = 1; i <= num; i++) {
			facto *= i;
			sum += facto;
		}
		System.out.println("Factorial = " + facto);
		System.out.print("Sum = " + sum);

	}

}
