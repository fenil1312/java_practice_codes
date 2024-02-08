package oops;

class Demo {
	static int count = 0;

	static void display() {
		count++;
		System.out.println("Current instance of class = " + count);
	}
}

public class CountInstances {

	public static void main(String[] args) {
		Demo d1 = new Demo();
		d1.display();
		Demo d2 = new Demo();
		d2.display();
		Demo d3 = new Demo();
		d3.display();
		Demo d4 = new Demo();
		d4.display();
		Demo d5 = new Demo();
		d5.display();
	}

}
