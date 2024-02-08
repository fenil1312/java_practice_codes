
public class SumOfPrime {

	public static void main(String[] args) {

		int sum = 0;
		boolean check = false;

		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					check = true;
					break;
				}
			}
			if (check != true) {
				sum += i;
			}
			check = false;
		}
		System.out.print("Sum = " + sum);

	}

}
