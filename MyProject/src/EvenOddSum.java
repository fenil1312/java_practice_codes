
public class EvenOddSum {

	public static void main(String[] args) {
		// find sum of even and odd number from 1 to 100
		int num = 1;
		int odd_sum = 0, even_sum = 0;

		while (num <= 100) {
			if (num % 2 == 0) {
				even_sum += num;
			} else {
				odd_sum += num;
			}
			num++;
		}
		System.out.println("Sum of even number : " + even_sum + "\nSum of odd number : " + odd_sum);

	}

}
