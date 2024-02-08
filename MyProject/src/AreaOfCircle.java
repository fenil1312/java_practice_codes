import java.util.Scanner;
public class AreaOfCircle {

	public static void main(String[] args) {
		// find area of circle
		double pi = 3.14;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter radius of circle : ");
		int radius = s.nextInt();
		
		double area = pi*radius*radius;
		System.out.println("area of circle is " + area);

	}

}
