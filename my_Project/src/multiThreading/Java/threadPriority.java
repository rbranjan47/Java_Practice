package multiThreading.Java;

/*
 * After defining a thread, Thread schedular Job is to assign that thread to JVM
 * Each thread have priority, [Layman's language Concept]
 * 
 * Priority are defined from 
 *   0 to 10
 *   
 *   [Higher number refers higher priority]
 * & 3 Priority Constants:
 * 
 * --> public static int NORM_PRIORITY
 * --> public static int MIN_PRIORITY
 * --> public static int MAX_PRIORITY 
 *
 */
public class threadPriority extends Thread {
	public void run() {
		System.out.println("Inside run method...");
	}

	public static void main(String[] args) {
		threadPriority t1 = new threadPriority();
		threadPriority t2 = new threadPriority();
		threadPriority t3 = new threadPriority();

		// thread 1 priority
		System.out.println("t1 thread priority " + t1.getPriority());

		// thread 2 priority
		System.out.println("t1 thread priority " + t2.getPriority());

		// thread 3 priority
		System.out.println("t1 thread priority " + t3.getPriority());

		// seeting thread priority
		t1.setPriority(2);
		t2.setPriority(5);
		t3.setPriority(1);

		// thread 1 priority
		System.out.println("t1 thread priority " + t1.getPriority());

		// thread 2 priority
		System.out.println("t1 thread priority " + t2.getPriority());

		// thread 3 priority
		System.out.println("t1 thread priority " + t3.getPriority());

		// seeting thread priority
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(NORM_PRIORITY);
		t3.setPriority(MAX_PRIORITY);

		// thread 1 priority
		System.out.println("t1 thread priority " + t1.getPriority());

		// thread 2 priority
		System.out.println("t1 thread priority " + t2.getPriority());

		// thread 3 priority
		System.out.println("t1 thread priority " + t3.getPriority());
		
		//main thread
		System.out.println(Thread.currentThread().getName());
		System.out.println("main thread priority..."+ Thread.currentThread().getPriority());
		
		//setting main thread priority 10
		Thread.currentThread().setPriority(10);
		
		System.out.println("main thread priority..."+ Thread.currentThread().getPriority());
		
		
	}
}
