import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// Find factorial of a given number
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = sc.nextInt();
		int facto = 1;
		for (int i = 1; i <= num; i++) {
			facto *= i;
		}
		System.out.println("Factorial of " + num + " is " + facto);

	}

}
