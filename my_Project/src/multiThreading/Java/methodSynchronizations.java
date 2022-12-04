package multiThreading.Java;
/*
 * >>Threads communicates primarily by sharing access to fields & objects
 * 
 * >> This form of communication extremely efficient, but makes 2 kind of error possible:
 *    a. Thread Interference
 *    b. Memory consistency erros
 *    
 *    
 * >> Synchronization is needed when multiple object is Mutable.
 * 
 * >> If object is shared by multiple threads then there is need of synchronization
 *     to avoid the Object's state to be getting corrupted.
 *     
 *     i.e. Each thread will receive same state of Object, without get changed by another thread 
 *     
 * >> In Java, 2'types of Synchronization:
 *     Methods Synchronization
 *     Statement(s) Synchronization(Block Synchronization)
 */

// Method Synchronization -> When Object is visible to more than One Threads
class Line {
	/*Multiple Threads using same Object
	 * then o/p: 0
	 *           0
	 *           1
	 *           1
	 *           2
	 *           2
	 *      
	 * If we add Synchronized keyword in front of method, One Thread will run at a time 
	 * and o/p will: 0
	 *               1
	 *               2
	 *               0
	 *               1
	 *               2
	*/ 
	
	synchronized public void getLine() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class Train extends Thread {
	Line lines;

	Train(Line line) {
		lines = line;
	}

	@Override
	public void run() {
		lines.getLine();
	}
}

public class methodSynchronizations {
	public static void main(String[] args) {
		Line obj = new Line();
		
		//Creating 2 thread
		Train train1 = new Train(obj);
		Train train2 = new Train(obj);
		
		train1.start();
		train2.start();
	}
}
