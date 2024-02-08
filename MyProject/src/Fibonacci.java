import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		int a = 0, b = 1, c;
		System.out.print(a + ", ");
		while (n > 0) {
			System.out.print(b);
			if (n > 1) {
				System.out.print(", ");
			} else {
				System.out.print(".");
			}
			c = a + b;
			a = b;
			b = c;
			n--;
		}
	}

}
