import java.util.Scanner;

public class CheckAge {

	public static void main(String[] args) {
		// check age is major or minor
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age : ");
		byte age = sc.nextByte();

		if (age <= 0) {
			System.out.println("Invalid age");
		} else if (age < 18) {
			System.out.println("Age is minor");
		} else {
			System.out.println("Age is major");
		}

	}

}
