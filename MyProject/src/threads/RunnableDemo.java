package threads;

class ThreadR implements Runnable {

	@Override // Annotations - added in Java 5 version
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
			if (i < 10) {
				System.out.print(", ");
			}
		}
	}
}

public class RunnableDemo {

	public static void main(String[] args) {

		ThreadR x = new ThreadR();
		Thread t = new Thread(x);
		t.start();

	}

}
