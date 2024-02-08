package collections;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		// size() method is used to find length 

		// HashSet is unordered & no duplicate elements
		System.out.println("Using HashSet...");
		HashSet<String> hs = new HashSet<String>();
		hs.add("VOLVO");
		hs.add("AUDI");
		hs.add("TATA");
		hs.add("JAGUAR");
		hs.add("TOYOTA");
		hs.add("VOLVO");
		System.out.println(hs);
		
//		System.out.println(hs.contains("TATA"));
//		hs.remove("VOLVO");
//		hs.clear();
		
		for(String s : hs) {
			System.out.println(s);
		}
		System.out.println();
		
		// LinkedHashSet is ordered & no duplicate elements
		System.out.println("Using LinkedHashSet...");
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("VOLVO");
		lhs.add("AUDI");
		lhs.add("TATA");
		lhs.add("JAGUAR");
		lhs.add("TOYOTA");
		lhs.add("VOLVO");
		System.out.println(lhs);
		
//		System.out.println(lhs.contains("TATA"));
//		lhs.remove("VOLVO");
//		lhs.clear();
		
		for(String s : lhs) {
			System.out.println(s);
		}
		System.out.println();
		
		// TreeSet is sorted & no duplicate elements
		System.out.println("Using TreeSet...");
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("VOLVO");
		ts.add("AUDI");
		ts.add("TATA");
		ts.add("JAGUAR");
		ts.add("TOYOTA");
		ts.add("VOLVO");
		System.out.println(ts);
		
//		System.out.println(ts.contains("TATA"));
//		ts.remove("VOLVO");
//		ts.clear();
		
		for(String s : ts) {
			System.out.println(s);
		}
	}

}
