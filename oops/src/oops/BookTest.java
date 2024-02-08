package oops;

class Book {
	int bNo;
	String bName;
	double price;

	Book(int bNo, String bName, double price) {
		this.bNo = bNo;
		this.bName = bName;
		this.price = price;
	}

	Book() {
	}

	void display() {
		System.out.println("Book No. = " + bNo);
		System.out.println("Book Name = " + bName);
		System.out.println("Book Price = " + price + "💲");
	}
}

class SpecialEditionBook extends Book {
	double discount;

	SpecialEditionBook(int bNo, String bName, double price, double discount) {
		super(bNo, bName, price);
		this.discount = discount;
	}

	void display() {
		System.out.println();
		super.display();
		System.out.println("Value of discount = " + discount + "💲");
		discount = price - discount;
		System.out.println("Price after discount = " + discount + "💲");
	}
}

public class BookTest {

	public static void main(String[] args) {

		Book b1 = new Book(1, "Java", 300);
		b1.display();

		SpecialEditionBook s1 = new SpecialEditionBook(1, "Java", 300, 50);
		s1.display();
	}

}
