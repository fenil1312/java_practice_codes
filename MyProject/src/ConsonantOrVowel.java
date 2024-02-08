import java.util.Scanner;

public class ConsonantOrVowel {

	public static void main(String[] args) {
		// check the given character is vowel or consonant
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter character : ");
		char ch = sc.next().toLowerCase().charAt(0);

		if (Character.isAlphabetic(ch)) {
			switch (ch) {
			case 'a':
				System.out.println("Given character is vowel");
				break;
			case 'e':
				System.out.println("Given character is vowel");
				break;
			case 'i':
				System.out.println("Given character is vowel");
				break;
			case 'o':
				System.out.println("Given character is vowel");
				break;
			case 'u':
				System.out.println("Given character is vowel");
				break;
			default:
				System.out.println("Given character is consonant");

			}
		} else {
			System.out.print("Given character is numerical value");
		}

	}

}
