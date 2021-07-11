package Java_Gromming;

class child_thread extends Thread{
	@Override
	public void run() {
		for(int i = 0;i<5;i++) {
			System.out.println("child thread");
		}
	}
}
public class currentThreadMethod extends Thread{
	public static void main(String[] args) {
		//getting refrence to the Main Thread
		Thread t = Thread.currentThread();
		
		//getting name of the main Thread
		System.out.println(t.getName());
		
		//setting name of the main thread
		t.setName("main thread changed");
		System.out.println(t.getName());
		
		//getting priority of the main thread
		System.out.println("Main Thread Current Priority: "+t.getPriority());
		
		//setting priority of the main thread
		t.setPriority(MAX_PRIORITY);
		System.out.println("Main Thread Current Priority: "+t.getPriority());
		
		for(int i=0 ; i<5 ;i++){
			System.out.println("Main Thread");
		}
		
		//main thread creating a child Thread
		child_thread ct = new child_thread();
		
		System.out.println("Child Thread Priority: "+ct.getPriority());
        
		ct.setPriority(MIN_PRIORITY);
		System.out.println("Child Thread new priority: "+ct.getPriority());
		
		//Starting child thread
		ct.start();
	}
}
