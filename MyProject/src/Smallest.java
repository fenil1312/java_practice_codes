import java.util.Scanner;

public class Smallest {

	public static void main(String[] args) {
		// find smallest from given 10 numbers
		Scanner sc = new Scanner(System.in);
		int n = 1;
		int smallest = Integer.MAX_VALUE;
		while (n <= 10) {
			System.out.print("Enter num "+ n + " : ");
			int num = sc.nextInt();
			if (smallest > num) {
				smallest = num;
			}
			n++;
		}
		System.out.println("Smallest number is " + smallest);

	}

}
