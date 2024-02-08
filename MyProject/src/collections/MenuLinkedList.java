package collections;

import java.util.*;

public class MenuLinkedList {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		LinkedList ll = new LinkedList();

		System.out.print("How many element would you enter ? : ");

		try {
			int n = sc.nextInt();
			int choice;
			String modify;
			int index;

			for (int i = 0; i < n; i++) {
				System.out.print("Enter " + (i + 1) + " element : ");
				String str = sc.next();
				ll.add(str);
			}
			System.out.println();

			if (ll.size() == 1) {
				System.out.println("Your element is...");
			} else {
				System.out.println("Your elements are...");
			}
			System.out.println(ll);
			System.out.println();

			System.out.println(
					"If you want to make changes in above elements \nplease choose any below option otherwise choose Exit(10)...");
			System.out.println();

			do {
				System.out.println("1.  Add element at last");
				System.out.println("2.  Add element at first");
				System.out.println("3.  Add element at the given index");
				System.out.println("4.  Update element at the given index");
				System.out.println("5.  Delete the first element");
				System.out.println("6.  Delete the last element");
				System.out.println("7.  Delete the given element");
				System.out.println("8.  Delete the given element at the given index");
				System.out.println("9.  Display the elements");
				System.out.println("10. Exit");
				System.out.println();
				System.out.print("Enter your choice : ");
				choice = sc.nextInt();
				System.out.println();

				switch (choice) {
				case 1:
					System.out.print("Enter element : ");
					modify = sc.next();
					ll.addLast(modify);
					System.out.println();
					break;
				case 2:
					System.out.print("Enter element : ");
					modify = sc.next();
					ll.addFirst(modify);
					System.out.println();
					break;
				case 3:
					System.out.println("Note : Index value start with 0.");
					System.out.print("Enter index : ");
					index = sc.nextInt();
					System.out.print("Enter element : ");
					modify = sc.next();
					ll.add(index, modify);
					System.out.println();
					break;
				case 4:
					System.out.println("Note : Index value start with 0.");
					System.out.print("Enter index : ");
					index = sc.nextInt();
					System.out.print("Enter element : ");
					modify = sc.next();
					ll.set(index, modify);
					System.out.println();
					break;
				case 5:
					ll.removeFirst();
					break;
				case 6:
					ll.removeLast();
					break;
				case 7:
					System.out.print("Enter element : ");
					modify = sc.next();
					ll.remove(modify);
					System.out.println();
					break;
				case 8:
					System.out.println("Note : Index value start with 0.");
					System.out.print("Enter index : ");
					index = sc.nextInt();
					ll.remove(index);
					System.out.println();
					break;
				case 9:
					System.out.println(ll);
					System.out.println();
					break;
				case 10:
					System.out.println("Thank you, Have a good day...");
					break;
				default:
					System.out.println("Please choose the correct option...");
				}

			} while (choice != 10);
			
		} 
		catch (Exception e) {
			System.err.println("\nError : Please enter element length in number");
//			e.printStackTrace();
		}
	}

}
