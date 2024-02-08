package collections;

import java.util.*;

public class MapDemo {

	public static void main(String[] args) {
		// size() method is used to find length 

		// HashMap is unordered & no duplicate keys but it allows duplicate values
		System.out.println("Using HashMap...");
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("VOLVO", 1111);
		hm.put("AUDI", 2222);
		hm.put("TATA",3333);
		hm.put("JAGUAR",4444);
		hm.put("TOYOTA",1111);
		hm.put("VOLVO",2222);
		System.out.println(hm);
		
//		hm.remove("AUDI");
//		hm.clear();
		
		for(String s : hm.keySet()) {
			System.out.println(s + " : " + hm.get(s));
		}
		
//		for(int i : hm.values()) {
//			System.out.println(i);
//		}
		System.out.println();
		
		
		// LinkedHashMap is ordered & no duplicate keys but it allows duplicate values
		System.out.println("Using LinkedHashMap...");
		LinkedHashMap<String,Integer> lhm = new LinkedHashMap<String,Integer>();
		lhm.put("VOLVO", 1111);
		lhm.put("AUDI", 2222);
		lhm.put("TATA",3333);
		lhm.put("JAGUAR",4444);
		lhm.put("TOYOTA",1111);
		lhm.put("VOLVO",2222);
		System.out.println(lhm);
		
//		lhm.remove("TOYOTA");
//		lhm.clear();
		
		for(String s : lhm.keySet()) {
			System.out.println(s + " : " + lhm.get(s));
		}
		
//		for(int i : lhm.values()) {
//			System.out.println(i);
//		}
		System.out.println();
		
		
		// TreeMap is sorted & no duplicate keys but it allows duplicate values
		System.out.println("Using TreeMap...");
		TreeMap<String,Integer> tm = new TreeMap<String,Integer>();
		tm.put("VOLVO", 1111);
		tm.put("AUDI", 2222);
		tm.put("TATA",3333);
		tm.put("JAGUAR",4444);
		tm.put("TOYOTA",1111);
		tm.put("VOLVO",2222);
		System.out.println(tm);
		
//		tm.remove("JAGUAR");
//		tm.clear();
		
		for(String s : tm.keySet()) {
			System.out.println(s + " : " + tm.get(s));
		}
		
//		for(int i : tm.values()) {
//			System.out.println(i);
//		}
		
	}

}























