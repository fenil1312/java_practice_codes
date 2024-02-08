package collections;

import java.util.*;

public class RemoveDuplicate {

	public static void main(String[] args) {

//		List<Integer> mobileNo = new ArrayList<Integer>();
//		mobileNo.add(1111);
//		mobileNo.add(2222);
//		mobileNo.add(3333);
//		mobileNo.add(1111);	
//		mobileNo.add(5555);
//		mobileNo.add(4444);
//		mobileNo.add(2222);
//		mobileNo.add(8888);
//		mobileNo.add(5555);
//		System.out.println(mobileNo);
		
		// Collection factory method of() - added in Java 9 version
		List<Integer> mobileNo = List.of(1111,2222,3333,1111,5555,4444,2222,8888,5555);
		System.out.println(mobileNo);
		
		Set<Integer> removeDup = new LinkedHashSet<Integer>();
		removeDup.addAll(mobileNo);
		System.out.println(removeDup);
	}

}
