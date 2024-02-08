package oops;

interface Fruit2 {
	void cost();
}

class Apple2 implements Fruit2 {
	int weight = 250, price = 30;

	public void cost() {
		System.out.println(weight + "gm apples are just in " + price + " ruppes");
	}
}

class Mango2 implements Fruit2 {
	int weight = 250, price = 25;

	public void cost() {
		System.out.println(weight + "gm mangos are just in " + price + " rupees");
	}
}

public class FruitDemo2 {

	public static void main(String[] args) {

		Fruit2 f1 = new Apple2();
		f1.cost();

		Fruit2 f2 = new Mango2();
		f2.cost();

	}

}
