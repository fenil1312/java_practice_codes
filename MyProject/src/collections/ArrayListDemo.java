package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Hyundai");
		ar.add("TATA");
		ar.add("Mahindra");
		ar.add("TOYOTA");
		ar.add("Audi");
		ar.add(2, "Jaguar");
		ar.set(3, "Maruti");
		System.out.println(ar);
		
//		ar.remove("Audi");
//		ar.remove(2);
//		ar.clear();
		Collections.sort(ar);
//		System.out.println("hello");
		for (int i = 0; i < ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		
		// Collection factory method of() - added in Java 9 version
		List<Integer> ls = List.of(1111,2222,3333,1111,4444,5555,6666);
		System.out.println(ls);

	}

}
