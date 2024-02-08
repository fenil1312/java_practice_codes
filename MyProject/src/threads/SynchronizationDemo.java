package threads;

class Table {

	synchronized void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + (n * i));
		}
	}
}

class Thread1 extends Thread {
	Table t;

	Thread1(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}
}

class Thread2 extends Thread {
	Table t;

	Thread2(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(8);
	}
}

public class SynchronizationDemo {

	public static void main(String[] args) {

		Table t = new Table();

		Thread1 t1 = new Thread1(t);
		t1.start();

		Thread2 t2 = new Thread2(t);
		t2.start();
	}

}
