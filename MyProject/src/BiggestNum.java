import java.util.Scanner;

public class BiggestNum {

	public static void main(String[] args) {
		// find biggest among given three number
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st num : ");
		int num1 = sc.nextInt();
		System.out.print("Enter 2nd num : ");
		int num2 = sc.nextInt();
		System.out.print("Enter  num : ");
		int num3 = sc.nextInt();
		
		int max = (num1>num2)?(num1>num3?num1:num3):(num2>num3?num2:num3);

		System.out.print("Max = " + max);
		
		
//		if (num1 > num2) {
//			if (num1 > num3) {
//				System.out.println("Biggest number is " + num1);
//			}
//		} else if (num2 > num3) {
//			System.out.println("Biggest number is " + num2);
//		} else {
//			System.out.println("Biggest number is " + num3);
//		}

	}

}
