package multiThreading.Java;

/* Multi-Threading:
 * Ways to define a Thread
 *      - By extending thread class 
 *      - By implementing runnable interface
 *      
 * Getting & Setting name of Thread
 * 
 * Thread Priorities
 * 
 * Methods:
 *   - yield()
 *   - join()
 *   - sleep() 
 *   
 *Synchronizatio
 *
 *Inter-Thread communication
 *  - wait
 *  - Notify
 *  - Notify all
 *  
 * 
 *Dead-lock
 *
 *Deamon Threads
 *
 *Multi-Threading Enhancements
 *  - Thread Group
 *  - Thread Local
 *  - Executor Framework
 */
 
public class demoMultiThreading extends Thread {

	//defining a thread
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("child thread" + i);
		}
	} 

	public static void main(String[] args) {
		// Initializing run thread
		demoMultiThreading classMethod = new demoMultiThreading();

		classMethod.start();
		//classMethod.run();
		
		/*
		 * start() [java.lang.Threadclass] , a new Thread created and then run
		 * run()[java.lang.Runnable]  , no new thread created, will execute on same flow 
		 * 
		 * 
		 * start() --> can't invoke more than 1 time
		 * run() --> invoke more than 1 time
		 * 
		 * 
		 */

		/*
		 * start()  --> With Thread.start() Create new Thread, i.e. Heart of Multi-Threading
		 */
		for (int j = 5; j < 10; j++) {
			System.out.println("main thread " + j);
		}
	}
}
