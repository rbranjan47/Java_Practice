package Java_Gromming;

class thread_priority_child extends Thread{
	@Override
	public void run() {
		System.out.println("Inside the run method");
		if(Thread.currentThread().isDaemon()) {
			System.out.println("daemon thread work");
		}
		else {
			System.out.println("user thread still running");
		}
	}
}
public class thread_priority {
	public static void main(String[] args) {
		thread_priority_child t1 = new thread_priority_child();
		thread_priority_child t2 = new thread_priority_child();
		thread_priority_child t3 = new thread_priority_child();
		
		System.out.println(t1.getName()+" "+t1.getId()+" "+t1.getClass()+" "+t1.getPriority());
		System.out.println(t2.getName()+" "+t2.getId()+" "+t2.getClass()+" "+t2.getPriority());
		System.out.println(t3.getName()+" "+t3.getId()+" "+t3.getClass()+" "+t3.getPriority());
		
		//setting up the priority of the thread
		t1.setPriority(2);
		t2.setPriority(5);
		t3.setPriority(8);
		
		System.out.println(t1.getName()+" "+t1.getId()+" "+t1.getClass()+" "+t1.getPriority());
		System.out.println(t2.getName()+" "+t2.getId()+" "+t2.getClass()+" "+t2.getPriority());
		System.out.println(t3.getName()+" "+t3.getId()+" "+t3.getClass()+" "+t3.getPriority());
		
		t1.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
		
		//displaying the name of the executing thread
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
		//main thread creating a child thread
		thread_priority_child ct = new thread_priority_child();
		System.out.println("Child Thread Priority "+ ct.getPriority());
		
		ct.start();
	}
}
