import java.util.*;

public class Palindrome {

	public static boolean isPalindrome(String str) {
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string/Number : ");
		String str = sc.next();

		if (isPalindrome(str) == true) {
			System.out.println(str + " is palindrome");
		} else {
			System.out.println(str + " is not palindrome");
		}

	}

}
