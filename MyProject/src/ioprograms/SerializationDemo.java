package ioprograms;

import java.io.*;

class Book implements Serializable {
	int bNo;
	String bName;
	transient double price;  // transient - not include during serialization

	public Book(int bNo, String bName, double price) {
		super();
		this.bNo = bNo;
		this.bName = bName;
		this.price = price;
	}

	public Book() {
	}

	public String toString() {
		return bNo + " " + bName + " " + price;
	}
}

public class SerializationDemo {

	public static void main(String[] args) throws Exception {

		// Serialization
		FileOutputStream fos = new FileOutputStream("book.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Book b = new Book(1, "Java Fullstack", 5000);
		oos.writeObject(b);
//		System.out.println("File created successfully");
		oos.close();
		fos.close();

		// De-serialization
		FileInputStream fis = new FileInputStream("book.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Book b1 = (Book) ois.readObject();
		System.out.println(b1); // invokes toString() implicitly
		ois.close();
		fis.close();
	}

}
