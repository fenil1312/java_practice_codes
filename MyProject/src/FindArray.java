import java.util.*;

public class FindArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many numbers you have..! : ");
		int n = sc.nextInt();
		int num[] = new int[n];

		for (int i = 0; i < num.length; i++) {
			System.out.print("Enter number " + (i + 1) + " : ");
			num[i] = sc.nextInt();
		}

		Arrays.sort(num);

		for (int i = 0; i < num.length; i++) {
//			for (int j = i + 1; j < num.length; j++) {
//				if (num[j] < num[i]) {
//					int temp = num[i];
//					num[i] = num[j];
//					num[j] = temp;
//				}
//			}
//		}
//
//		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.print("\nBiggest = " + num[num.length - 1] + "\nSecond Big = " + num[num.length - 2]
				+ "\nSmallest = " + num[0] + "\nSecond Small = " + num[1]);

	}
}
