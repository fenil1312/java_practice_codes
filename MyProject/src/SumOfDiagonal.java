import java.util.Scanner;
public class SumOfDiagonal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a value of n to form a n*n matrix : ");
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		int sum = 0;
		
		System.out.println("Enter numbers : ");
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
				if(i==j) {
					sum += arr[i][j];
				}
			}
			System.out.println();
		}
		System.out.print("Sum of diagonal is " + sum);
		

	}

}
