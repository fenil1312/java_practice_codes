package java8;

import java.util.*;
import java.util.stream.*;

class Product {
	int pno;
	String pname;
	double price;

	Product(int pno, String pname, double price) {
		this.pno = pno;
		this.pname = pname;
		this.price = price;
	}

	Product() {

	}

	@Override
	public String toString() {
		return pno + " " + pname + " " + price;
	}
}

public class StreamDemo2 {

	public static void main(String[] args) {

//		List<Product> list1 = new ArrayList<Product>();
//		for (Product prod : getProducts()) {
////			System.out.println(prod);
//			if (prod.price > 1000) {
//				list1.add(prod);
//			}
//		}
//		list1.forEach(System.out::println);

		List<Product> list2 = getProducts().stream().filter((prod) -> prod.price > 1000).collect(Collectors.toList());
		list2.forEach(System.out::println);
	}

	private static List<Product> getProducts() {
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(111, "mouse", 300));
		productList.add(new Product(222, "monitor", 1500));
		productList.add(new Product(333, "keybord", 500));
		productList.add(new Product(444, "CPU", 5000));
		productList.add(new Product(555, "USB", 1000));
		productList.add(new Product(666, "charger", 4000));
		return productList;
	}
}
