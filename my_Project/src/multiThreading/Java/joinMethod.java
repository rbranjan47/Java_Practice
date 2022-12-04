package multiThreading.Java;
/*
 * join() method,
 *  Put the current thread on wait until the thread on which it is called is dead.
 *  
 *   Ex. public final void join()
 *   
 *   >> Constructor:
 *      > join()
 *      > join(long millis)
 *      > join(long millis, int nanos) 
 */

class threadProcessing extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(2000);
				System.out.println("Current Thread: " + Thread.currentThread().getName());
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
	}
}

public class joinMethod {
	public static void main(String[] args) {
		threadProcessing threadsprocessing1 = new threadProcessing();
		threadProcessing threadsprocessing2 = new threadProcessing();
		threadProcessing threadsprocessing3 = new threadProcessing();

		// starting thread 1
		threadsprocessing1.start();

		try {
			System.out.println("Current Thread: " + Thread.currentThread().getName());
			threadsprocessing1.join();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		// starting thread 2
		threadsprocessing2.start();

		try {
			System.out.println("Current Thread: " + Thread.currentThread().getName());
			threadsprocessing2.join();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		// starting thread 3
		threadsprocessing3.start();
	}
}
