package multiThreading.Java;

/*
 * Daemon Threads:
 * LOW Priority Thread in Java, performs tasks ----> Garbage Collection
 *      Also, known as Service Provider Threads , provides servie to User Threads for background supporting tasks.
 * 
 * 
 * Its life depends upon mercy of user Threads. i.e. when user Thread will die 
 *           JVM terminates its automatically.
 *           
 *           
 *>> By default, the main thread is always non-daemon.
 *>> For remaining threads, Daemon nature will inherited from Parent to child.
 *>> Whenever last daemon threads terminates then all daemon threads terminates.
 *
 *METHODS:
 *a. void setDaemon(boolean on)       ---> Marks current thread as Daemon Thread or User Thread
 *
 *  on: if true, marks this thread as a daemon thread
 *  
 *b. boolean isDaemon()               ---> Checks that current thread is Daemon Thread or not.
 *
 */
public class daemonThreads extends Thread {

	public daemonThreads(String names) {
		super(names);
	}

	public void run() {
		//checking current thread isDaemon or not
		if(Thread.currentThread().isDaemon()) {
			System.out.println(getName()+" is Daemon thread!");
		}
		else {
			System.out.println(getName()+" is user thread!");
		}
	}
	
	public static void main(String[] args) {
		daemonThreads t1 = new daemonThreads("t1");
		daemonThreads t2 = new daemonThreads("t2");
		daemonThreads t3 = new daemonThreads("t3");
		
		//setting as daemon
		t1.setDaemon(true);
		
		t1.start();
		t2.start();
		
		//not setting daemon
		t3.setDaemon(false);
		t3.start();
	}
	/*
	 * If we Set Daemon after Thread start, it will throw Illegal Agrument Exception
	 * i.e.
	 * 
	 * t1.start();
	 *.....setting as daemon.....
	 * t1.setDaemon(true);
	 */
}
