package Java_Gromming;

class thread_priority_child extends Thread{
	@Override
	public void run() {
		System.out.println("Inside the run method");
	}
}
public class thread_priority {
	public static void main(String[] args) {
		thread_priority_child t1 = new thread_priority_child();
		thread_priority_child t2 = new thread_priority_child();
		thread_priority_child t3 = new thread_priority_child();
	}
}
