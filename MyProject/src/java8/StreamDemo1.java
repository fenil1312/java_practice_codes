package java8;

import java.util.*;
import java.util.stream.*;

public class StreamDemo1 {

	public static void main(String[] args) {

		// Ways of Traversing/Iterating
		List<String> list1 = List.of("VOLVO", "JAGUAR", "AUDI");

		// Using Traditional for loop
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		System.out.println();

		// Enhanced for loop - added in Java 5 version
		for (String s : list1) {
			System.out.println(s);
		}
		System.out.println();

		// forEach() - added in Java 8 version
		list1.forEach(s -> System.out.println(s));
		System.out.println();

		// Method reference - added in Java 8 version
		list1.forEach(System.out::println);
		System.out.println();

		// Creating Stream using List
		Stream<String> stream1 = list1.stream();
		stream1.forEach(System.out::println);
		System.out.println();

		// Creating Stream using Set
		Set<String> set1 = new HashSet<String>(list1);
		Stream<String> stream2 = set1.stream();
		stream2.forEach(System.out::println);
		System.out.println();

		// Creating Stream using Arrays
		String[] strArray = { "VOLVO", "JAGUAR", "AUDI" };
		Stream<String> stream3 = Arrays.stream(strArray);
		stream3.forEach(System.out::println);
	}

}
