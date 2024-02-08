import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		// check discount and net price
		Scanner sc = new Scanner(System.in);
		System.out.print("Item number : ");
		int p_num = sc.nextInt();
		System.out.print("\nItem name : ");
		String p_name = sc.next();
		System.out.print("\nItem price : ");
		double p_rate = sc.nextDouble();
		System.out.print("\nItem quantity : ");
		int p_qty = sc.nextInt();
		double discount, net_price, total_price;

		if (p_rate >= 1000 && p_rate < 2000) {
			discount = 0.10 * p_rate;
			net_price = p_rate - discount;
			total_price = p_qty * net_price;
			System.out.print("\nDiscount is 10% on price\n" + "Item number : " + p_num + "\nItem name : " + p_name
					+ "\nItem Price : " + p_rate + "\nDiscount : " + discount + "\nNet price : " + net_price
					+ "\nTotal amount : " + total_price);
		}
		if (p_rate >= 2000 && p_rate < 3000) {
			discount = 0.15 * p_rate;
			net_price = p_rate - discount;
			total_price = p_qty * net_price;
			System.out.print("\nDiscount is 15% on price\n" + "Item number : " + p_num + "\nItem name : " + p_name
					+ "\nItem Price : " + p_rate + "\nDiscount : " + discount + "\nNet price : " + net_price
					+ "\nTotal amount : " + total_price);
		}
		if (p_rate >= 3000 && p_rate < 5000) {
			discount = 0.20 * p_rate;
			net_price = p_rate - discount;
			total_price = p_qty * net_price;
			System.out.print("\nDiscount is 20% on price\n" + "Item number : " + p_num + "\nItem name : " + p_name
					+ "\nItem Price : " + p_rate + "\nDiscount : " + discount + "\nNet price : " + net_price
					+ "\nTotal amount : " + total_price);
		}
		if (p_rate >= 5000) {
			discount = 0.25 * p_rate;
			net_price = p_rate - discount;
			total_price = p_qty * net_price;
			System.out.print("\nDiscount is 25% on price\n" + "Item number : " + p_num + "\nItem name : " + p_name
					+ "\nItem Price : " + p_rate + "\nDiscount : " + discount + "\nNet price : " + net_price
					+ "\nTotal amount : " + total_price);
		}

	}

}
