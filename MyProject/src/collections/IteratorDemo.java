package collections;

import java.util.*;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Hyundai");
		al.add("TATA");
		al.add("Mahindra");
		al.add("TOYOTA");
		al.add("Audi");
		al.add("Jaguar");
		System.out.println(al);
		
		Iterator it = al.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println();
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(12);
		ar.add(5);
		ar.add(8);
		ar.add(10);
		ar.add(6);
		ar.add(15);
		ar.add(2);
		System.out.println(ar);
		
		System.out.println("After iterating...");
		Iterator<Integer> ir = ar.iterator();
		
		while(ir.hasNext()) {
			Integer i = ir.next();
			if(i < 10) {
				ir.remove();
			}
		}
		System.out.println(ar);
	}

}


















