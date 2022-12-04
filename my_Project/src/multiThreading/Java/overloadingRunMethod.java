package multiThreading.Java;

public class overloadingRunMethod extends Thread {

	/*
	 * OverLoading of start() ----> Thread.start() can be invoked Overloaded method
	 * Call Explicitily
	 * 
	 */

	public void run() {
		System.out.println("run method");
	}

	public void run(int i) {
		System.out.println("overridden run method " + i);
	}

	public static void main(String[] args) {
		overloadingRunMethod t = new overloadingRunMethod();
		t.start();
		System.out.println("main method");

		// we have to call override method explicitily
		t.run(10);
	}
}
