// Methods of thread class
package threads;

class MyThread extends Thread {

	public void run() {
//		System.out.println("My Thread");
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("MyThread");
		System.out.println(t);
		System.out.println(t.getName());
		t.setPriority(9);
		System.out.println(t);
		System.out.println(t.getPriority());
		
	}
}

public class ThreadMethodsDemo {
	public static void main(String[] args) {

		MyThread t = new MyThread();
		t.start();   // Creates a thread and invokes run()
		
//		MyThread t1 = new MyThread();
//		t1.start();
	}

}
