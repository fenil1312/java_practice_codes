import java.util.*;

public class ReversTextWords {

	public static void reverse(String text) {
		String[] words = text.split(" ");

		for (int i = 0; i < words.length; i++) {
			char[] str = words[i].toCharArray();
			for (int j = str.length - 1; j >= 0; j--) {
				System.out.print(str[j]);
			}
			System.out.print(" ");
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text : ");
		String text = sc.nextLine();
//		String text = "Hello World";

		reverse(text);
	}

}
