package multiThreading.Java;

public class implementRunnable implements Runnable {
	@Override
	public void run() {
		try {
			System.out.println("run " + Thread.currentThread().getId()+" "+Thread.currentThread().getName());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		// Creating Thread Object
		Thread t = new Thread(new implementRunnable());
		t.start();
		t.run();
		System.out.println("main " + Thread.currentThread().getId()+" "+Thread.currentThread().getName());
	}

}
