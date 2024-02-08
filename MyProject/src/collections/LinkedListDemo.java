package collections;

import java.util.LinkedList;
import java.util.Collections;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Hyundai");
		ll.add("TATA");
		ll.add("Mahindra");
		ll.add("TOYOTA");
		ll.add("Audi");
		ll.add(2, "Jaguar");
		ll.set(3, "Maruti");
		System.out.println(ll);
		
//		ll.remove("Audi");
//		ll.remove(2);
//		ll.clear();
//		Collections.sort(ll);
		
		// additional methods in LinkedList
		ll.addFirst("My Cars");
		ll.addLast("Car List");
//		ll.removeFirst();
//		ll.removeLast();
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println();
		
//		System.out.println("hello");
		for (int i = 0; i < ll.size(); i++) {
			System.out.println(ll.get(i));
		}
	}

}
