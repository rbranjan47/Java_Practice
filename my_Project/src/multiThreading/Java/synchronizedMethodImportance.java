package multiThreading.Java;

/*
 * Synchronization means Co-oridination between Processes/Threads.
 * 2 Types of Synchronizations:
 *   a. Process Synchronization
 *   b. Thread Synchronization
 *   
 * >> Synchronization is build using LOCKS or MONITOR.
 *   >> LOCKS
 *   >> MONITOR: is an Object that is used as a mutually execlusive lock.
 *               Only single thread at a time has the right to own a monitor. 
 *               When a thread gets a lock, then all others threads gets suspended which are trying to LOCK the monitor.
 *               
 * 2 Types of Thread Synchronization:
 *     1. Mutual Exclusive
 *     2. Inter-Thread Communication
 *     
 *              
 * >> Mutual Exclusive
 *     -- While sharing any resources, this will keep the thread interfering with one another i.e. mutual exclusive.
 *          To achieve this:
 *          >>Synchronized Method
 *          >>Synchronized Block
 *          >> Static Synchronization
 *
 */

// Synchronized Method  -- Using synchronized along method names

//Print method
class printTest extends Thread {
	synchronized public void printTestMethod(int n) {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread " + n + " is executed!");
			try {
				// sleep for 1000 milliseconds
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		if (Thread.currentThread().getPriority() > 4) {
			System.out.println("----------------------------------");
		} else {
			System.out.println("");
		}
		try {
			// sleep for 1000 milliseconds
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}

//first Thread Execution
class printThreadExecutionThread1 extends Thread {
	printTest printsTest;

	// constructor to initiate variables
	public printThreadExecutionThread1(printTest test) {
		printsTest = test;
	}

	// run method
	public void run() {
		printsTest.printTestMethod(1);
	}
}

//Second Thread execution
class printThreadExecutionThread2 extends Thread {
	printTest printsTest;

	// constructor to initiate variables
	public printThreadExecutionThread2(printTest test) {
		printsTest = test;
	}

	// run method
	public void run() {
		printsTest.printTestMethod(2);
	}
}

//Third Thread Execution
class printThreadExecutionThread3 extends Thread {
	printTest printsTest;

	// constructor to initiate variables
	public printThreadExecutionThread3(printTest test) {
		printsTest = test;
	}

	// run method
	public void run() {
		printsTest.printTestMethod(3);
	}
}

public class synchronizedMethodImportance {
	public static void main(String[] args) {
		printTest printTests = new printTest();

		// passing same object to thread to run
		printThreadExecutionThread1 printsThreadExec1 = new printThreadExecutionThread1(printTests);
		printThreadExecutionThread2 printsThreadExec2 = new printThreadExecutionThread2(printTests);
		printThreadExecutionThread3 printsThreadExec3 = new printThreadExecutionThread3(printTests);

		// starting threads
		printsThreadExec1.setPriority(10);
		printsThreadExec1.start();
		printsThreadExec2.setPriority(6);
		printsThreadExec2.start();
		printsThreadExec3.setPriority(1);
		printsThreadExec3.start();
	}
}
