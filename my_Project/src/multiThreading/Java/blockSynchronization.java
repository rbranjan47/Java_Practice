package multiThreading.Java;
/*
 * Block Synchronization: If we need to execute some subsequent line of code, not all lines
 * 
 */

class integerSum {
	public void sumOfInteger(int a) {
		for (int i = 0; i < 3; i++) {
			System.out.println("sum is " + (i + a) + " in " + Thread.currentThread().getName());
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class threadedSum extends Thread {
	private int a;
	integerSum integerOfSum;

	threadedSum(int value, integerSum obj) {
		a = value;
		integerOfSum = obj;
	}

	public void run() {
		// block synchronization
		synchronized (integerOfSum) {
			integerOfSum.sumOfInteger(a);
		}
	};
}

public class blockSynchronization {
	public static void main(String[] args) {
		integerSum sumOfInteger = new integerSum();

		// Creating multiple Threads
		threadedSum threadSum1 = new threadedSum(10, sumOfInteger);
		threadedSum threadSum2 = new threadedSum(20, sumOfInteger);
		threadedSum threadSum3 = new threadedSum(30, sumOfInteger);
		threadedSum threadSum4 = new threadedSum(40, sumOfInteger);
		threadedSum threadSum5 = new threadedSum(50, sumOfInteger);

		// starting thread
		threadSum1.start();
		threadSum2.start();
		threadSum3.start();
		threadSum4.start();
		threadSum5.start();

		try {
			threadSum1.join();
			threadSum2.join();
			threadSum3.join();
			threadSum4.join();
			threadSum5.join();
		} catch (Exception e) {
			System.out.println("Interrupted...");
		}
	}
}
