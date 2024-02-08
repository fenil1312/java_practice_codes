package oops;

class Rectangle {
	double length, breadth;

	Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	void area() {
		double areaOfRectangle = length * breadth;
		System.out.println("Area of Rectangle is " + areaOfRectangle);
	}
}

public class Main2 {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(5, 4);
		r1.area();

	}

}
