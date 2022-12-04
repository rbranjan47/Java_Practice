package multiThreading.Java;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 *  A ThreadPool ---> Reuses the previously Created thread to execute current task
 *                    & Offers solutions to the problem of thread Cycles Overhead and Thrashing
 *                    
 *                    
 *  Steps:
 *  1. Create a task(runnable object)
 *  2. Create Executor Pool Using Executors
 *  3. Pass tasks to Executor pool
 *  4. Shutdown the executor pool
 *  
 *  
 *  EXECUTOR THREAD POOLS METHOD:
 *  >> newFixedThreadPool(int)   ---> Creates a fixed size thread pool
 *  >> newCachedThreadPool()     ---> Creates a thread pool that creates new threads as needed, but will reuse previously
 *  >> newSingleThreadExecutor() ---> Creates a single Thread
 *  
 */
class Task implements Runnable {

	private String name;

	// constructor, initialize variables
	public Task(String str) {
		name = str;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i <= 5; i++) {
				if (i == 0) {
					SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
					Date dates = new Date(i);
					System.out.println("Initialization time of " + name + " at: " + dateFormat.format(dates));
				} else {
					Date dates = new Date(i);
					SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
					System.out.println("Execution time of " + name + " at: " + dateFormat.format(dates));
				}
				Thread.sleep(2000);
			}
			System.out.println(name + " completed!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

public class threadPool {
	static final int max_count = 3;

	public static void main(String[] args) {
		// Created 5 tasks
		Runnable r1 = new Task("Task 1");
		Runnable r2 = new Task("Task 2");
		Runnable r3 = new Task("Task 3");
		Runnable r4 = new Task("Task 4");
		Runnable r5 = new Task("Task 5");

		// Creating pool
		ExecutorService pool = Executors.newFixedThreadPool(max_count);

		// passes task in pool
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		pool.execute(r5);

		pool.shutdown();
	}
	/*
	 * RISK'S:
	 * 1. DeadLock
	 * 2. Thread Leakage  --> Thread removed from the pool to execute a task, but not returned to it
	 * 3. Resource Thrashing     ---> When Thread pool size large, then time wasting in thread switching cause Resource Thrashing
	 * 
	 */
	
	/*
	 * IMPORTANT POINTS:
	 * 1. Don't queue task, which waits for result from other task, cause DEADLOCK
	 * 2. Not to use Thread taking much time for operations, cause another thread long waiting 
	 * 3. Pool MUST END AT END. Otherwise program keeps executing
	 */
}
