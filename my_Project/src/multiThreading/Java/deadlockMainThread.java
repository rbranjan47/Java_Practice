package multiThreading.Java;

/*
 * Main Thread DeadLock
 * Using a single Thread
 */
public class deadlockMainThread {
	public static void main(String[] args) {

		try {
			System.out.println("entering into deadlock");

			Thread.currentThread().join();
			// join() --> Allows one thread to wait until another thread completes its execution
			// If current thread is waiting to join on the same thread, cause dead
			
			// If interrupted then Interrupted exception

			System.out.println("this statement will never exucute...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
