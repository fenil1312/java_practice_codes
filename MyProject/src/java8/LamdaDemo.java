package java8;

@FunctionalInterface
interface Phone {

	void call(int no);
}

//class AndroidPhone implements Phone {
//
//	public void call() {
//		System.out.println("Calling...");
//	}
//}

public class LamdaDemo {

	public static void main(String[] args) {

//		Phone p = new AndroidPhone();
//		p.call();

		// Anonymous inner class
//		Phone p = new Phone() {
//			public void call() {
//				System.out.println("Calling...");
//			}
//		};
//		p.call();

		// Lambda Expressions
//		Phone p = () -> {
//			System.out.println("Calling...");
//		};
//		p.call();
		
//		Phone p = () -> System.out.println("Calling...");
//		p.call();
		
//		Phone p = (int no) -> System.out.println("Calling... " + no);
//		p.call(2222);
		
//		Phone p = (no) -> System.out.println("Calling... " + no);
//		p.call(2222);
		
		Phone p = no -> System.out.println("Calling... " + no);
		p.call(2222);
	}

}
