import java.util.*;

public class StringDemo {
	public static void countVowelsConsonants(String str) {
		int vowelCount = 0;
		int consonantCount = 0;

		String text = str.toLowerCase();

		for (char i : text.toCharArray()) {
			if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
				vowelCount++;
			} else if (i >= 'a' && i <= 'z') {
				consonantCount++;
			}
		}
		System.out.println("Number of vowels : " + vowelCount);
		System.out.println("Number of consonants : " + consonantCount);
	}

	public static void countWords(String str) {
		String[] word = str.split(" ");
		System.out.println("Number of words : " + word.length);
	}

	public static void main(String[] args) {

		Scanner str = new Scanner(System.in);
		System.out.println("Enter text : ");
		String text = str.nextLine();

		countVowelsConsonants(text);
		countWords(text);
	}

}
