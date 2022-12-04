package multiThreading.Java;

class TestThread extends Thread {

	public void start() {
		super.start();
		System.out.println("Start Method");
	}

	public void run() {
		System.out.println("Run Method");
	}
}

//another class
 class startMethod {
	public static void main(String[] args) {
		TestThread t = new TestThread();
		t.start();
		System.out.println("Main Method");
	}
}
