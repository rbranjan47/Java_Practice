package multiThreading.Java;

/*
 * SYNCHRONIZATION:
 * >> Using Synchronized keyword
 * >> Only 1 thread exevute at a time
 * 
 * >> sync_object is reference to an Object
 * Ex.
 *    synchronized(sync_object)
 *    {
 *    >>shared variables and others
 *    >> shared resources
 *    }
 * 
 * 
 * >> Need of Synchronization:
 * 
 * import java.io.*;
 * 
 * class multiThread
 * {
 *   private int i=0;
 *   public void increment(){
 *      i++;
 *   }
 *   
 *  public int valueInteger(){
 *      return i;
 *   }
 *  }
 *  
 * class multipleExecution(){
 *   public static void main(String[] args){
 *   multiThread multi = new multiThread();
 *   multi.increment();
 *   System.out.println(multi.ValueInteger())
 *   }
 *  }
 *  
 *  
 *  O/P: 1
 *  
 *  As, 2nd Thread access the value from 1st Thread.
 *  
 *  >> After Synchronization, we'll able to prevent Object from getting corrupted
 *  >> As Variables, Objects and field gets shared in multi-threading.
 */

class sender {
	// sender class message
	public void send(String msg) {
		System.out.println("sending " + msg);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("Thread Interrupted!");
		}
		System.out.println(msg + " sent!");
	}
}

//synchronized
class ThreadedMessageSend extends Thread {
	private String msg;
	sender messageThreadSender;

	// constructor
	// receives message object & strings
	ThreadedMessageSend(String s, sender obj) {
		msg = s;
		messageThreadSender = obj;
	}

	@Override
	public void run() {
		// Making it Synchronized, to call 1 thread at a time
		synchronized (messageThreadSender) {
			// synchronizing the send object
			messageThreadSender.send(msg);
		}
	}
}

class unThreadedMessageSend extends Thread {
	private String msg;
	sender messageUnThreadSender;

	// constructor
	// receives message object & strings
	unThreadedMessageSend(String s, sender obj) {
		msg = s;
		messageUnThreadSender = obj;
	}

	// non-synchronized, result will vary
	public void run() {
		messageUnThreadSender.send(msg);
	}
}

public class synchronizatonDemo {
	public static void main(String[] args) {
		sender senders = new sender();

		System.out.println("----Synchronized----");
		// 2 Thraeds of ThreadedMessageSend
		ThreadedMessageSend s1 = new ThreadedMessageSend("Hi...", senders);
		ThreadedMessageSend s2 = new ThreadedMessageSend("Bye!", senders);

		// starting thraed
		s1.start();
		s2.start();

		// wait to join thread
		try {
			s1.join();
			s2.join();
		} catch (Exception e) {
			System.out.println("Interrupted!");
		}

		System.out.println("");
		System.out.println("----Non-Synchronized----");
		unThreadedMessageSend u1 = new unThreadedMessageSend("Hello...", senders);
		unThreadedMessageSend u2 = new unThreadedMessageSend("Tata...", senders);

		// starting thread
		u1.start();
		u2.start();
		// wait to join thread
		try {
			u1.join();
			u2.join();
		} catch (Exception e) {
			System.out.println("Interrupted!");
		}
	}
}
