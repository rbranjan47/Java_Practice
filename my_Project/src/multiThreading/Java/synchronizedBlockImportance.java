package multiThreading.Java;

//Synchronization Block -> Declaring block as synchronized
/*
 * Ex.-
 *    synchronized(object reference)
 *    {
 *    //Insert code here
 *    }
 */

class printTestData{
	public void printThreads(int n) {
		//this keyword refers to the current object in a method or constructor
		//SYNCHRONIZED BLOCK
		synchronized(this) {
			for(int i=0; i<5; i++) {
				System.out.println("Thread " + n + " is executed!");
				try {
					// sleep for 1000 milliseconds
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println(e.toString());
				}
			}
			System.out.println("-------------------------");
		}
	}
}

class printThreadExecutionsThread1 extends Thread {
	printTestData printsTest;

	// constructor to initiate variables
	public printThreadExecutionsThread1(printTestData test) {
		printsTest = test;
	}

	// run method
	public void run() {
		printsTest.printThreads(1);
	}
}

//Second Thread execution
class printThreadExecutionsThread2 extends Thread {
	printTestData printsTest;

	// constructor to initiate variables
	public printThreadExecutionsThread2(printTestData test) {
		printsTest = test;
	}

	// run method
	public void run() {
		printsTest.printThreads(2);
	}
}

//Third Thread Execution
class printThreadExecutionsThread3 extends Thread {
	printTestData printsTest;

	// constructor to initiate variables
	public printThreadExecutionsThread3(printTestData test) {
		printsTest = test;
	}

	// run method
	public void run() {
		printsTest.printThreads(3);
	}
}
public class synchronizedBlockImportance {
	public static void main(String[] args) {
		printTestData printTests = new printTestData();

		// passing same object to thread to run
		printThreadExecutionsThread1 printsThreadExec1 = new printThreadExecutionsThread1(printTests);
		printThreadExecutionsThread2 printsThreadExec2 = new printThreadExecutionsThread2(printTests);
		printThreadExecutionsThread3 printsThreadExec3 = new printThreadExecutionsThread3(printTests);

		// starting threads
		printsThreadExec1.setPriority(9);
		printsThreadExec1.start();
		printsThreadExec2.setPriority(7);
		printsThreadExec2.start();
		printsThreadExec3.setPriority(1);
		printsThreadExec3.start();
	}
}
