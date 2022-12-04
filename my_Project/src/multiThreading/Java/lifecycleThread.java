package multiThreading.Java;

/*
 * Thread lies in between:
 * 1. New  ---> New Thread is Created, not yet started
 *            public static final Thread.State NEW
 *            
 * 
 * 2. Runnable ---> A Thread is in Ready to Run State, moved to runnable state
 *                  In this state, Thread might be ready to run at any instant of time
 *            public static final Thread.State RUNNABLE
 *            
 *            
 * 3. Blocked/Waiting ---> Temporarly inactive, either 
 *                           Blocked
 *                           Waiting
 *            public static final Thread.State BLOCKED
 *            public static final Thread.State WAITING
 *            
 * 5.Timed Waiting ---> Like Thread.sleep(5000)
 *            public static final Thread.State TIME_WAITING
 *            
 * 
 * 6. Terminated ---> I. Entire Program executed normally
 *                   II. Because of some error occured
 *            public static final Thread.State TERMINATED
 *            
 *            
 */

class ThreadTest implements Runnable {
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("State of Thread1 while join to Thread2 " + lifecycleThread.thread1.getState());

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class lifecycleThread implements Runnable {

	public static Thread thread1;
	public static lifecycleThread obj;

	public static void main(String[] args) {
		thread1 = new Thread(obj);
		System.out.println("status of thread1 after creating " + thread1.getState());
		thread1.start();
		thread1.run();
		System.out.println("status of thread1 after starting " + thread1.getState());
	}

	@Override
	public void run() {
		ThreadTest threadtest = new ThreadTest();
		Thread thread2 = new Thread(threadtest);
		System.out.println("status of thread2 after creating " + thread2.getState());
		thread2.start();
		System.out.println("status of thread2 after starting " + thread2.getState());

		// moving thread1 to waiting state
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("thread2 after calling .sleep method " + thread2.getState());

		try {
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("thread2 after calling .sleep method " + thread2.getState());
	}
}
