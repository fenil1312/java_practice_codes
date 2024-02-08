package threads;

class ThreadX extends Thread {
	public void run() {
		Thread t = Thread.currentThread();
		t.setName("ThreadX");
		for (int i = 1; i <= 10; i++) {
			System.out.println(t.getName() + " : " + i);
			try {
				t.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreadY extends Thread {
	public void run() {
		Thread t = Thread.currentThread();
		t.setName("ThreadY");
		for (int i = 10; i >= 1; i--) {
			System.out.println(t.getName() + " : " + i);
			try {
				t.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class MultiThreadDemo {

	public static void main(String[] args) {

		ThreadX x = new ThreadX();
		x.start();

		ThreadY y = new ThreadY();
		y.start();
	}

}
