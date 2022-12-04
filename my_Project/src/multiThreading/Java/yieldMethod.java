package multiThreading.Java;
/*
 * yield() method,
 *      Causes currently executing thread object TEMPORARLY paused & allow other thread to execute
 *      
 *  ex. public static void yield() 
 *  
 *>> Uses of yield method:
 *  > Give priority to another waiting Threads, having priority equal/more than current thread
 *  > Thread calls java.lang.Thread.yield so it called Thread scheduler
 *  > Thread which Yielded, next execution of same thread depends upon scheduler
 * 
 *>> Thread requires more processing time will Use Yield() method.
 */

class myThreads extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("child thread " + i);
			Thread.yield();

			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
	}
}

public class yieldMethod {
	public static void main(String[] args) {
		myThreads t = new myThreads();

		for (int i = 0; i < 5; i++) {
			System.out.println("parent thread " + i);

			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		t.start();
	}
}
