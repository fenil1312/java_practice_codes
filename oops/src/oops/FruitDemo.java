package oops;

abstract class Fruit {
	abstract void cost();
}

class Apple extends Fruit {
	int weight = 500, price = 60;

	void cost() {
		System.out.println(weight + "gm apples are just in " + price + " rupees");
	}
}

class Mango extends Fruit {
	int weight = 500, price = 50;

	void cost() {
		System.out.println(weight + "gm mangos are just in " + price + " rupees");
	}
}

public class FruitDemo {

	public static void main(String[] args) {

		Fruit f1 = new Apple();
		f1.cost();
		
		Fruit f2 = new Mango();
		f2.cost();
	}

}
