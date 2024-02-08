import java.util.*;

public class SecondSmallBig {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int n = sc.nextInt();
		int[] num = new int[n];

		// array input
		for (int i = 0; i < n; i++) {
			System.out.print("Enter number " + (i + 1) + " : ");
			num[i] = sc.nextInt();
		}

		// array output
		System.out.println("Entered numbers are : ");
		for (int i = 0; i < n; i++) {
			System.out.print(num[i]);
			if (i < n - 1)
				System.out.print(", ");
			else
				System.out.println(".");
		}

		// array sorting
//		for (int i = 0; i < n; i++) {
//			for (int j = i + 1; j < n; j++) {
//				if (num[i] > num[j]) {
//					int temp = num[j];
//					num[j] = num[i];
//					num[i] = temp;
//				}
//			}
//		}

		// JAVA inbuilt sorting method
		Arrays.sort(num);

		// display sorted array
		System.out.println("Sorted array is : ");
		for (int i = 0; i < n; i++) {
			System.out.print(num[i]);
			if (i < n - 1)
				System.out.print(", ");
			else
				System.out.println(".");
		}

		// Second smallest and second biggest
		System.out.println("Second Smallest number is " + num[1]);
		System.out.println("Second Biggest number is " + num[num.length - 2]);

	}

}
