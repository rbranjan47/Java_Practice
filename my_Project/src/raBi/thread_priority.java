package raBi;


class thread_priority extends Thread
{
	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getPriority());  //getting main thread priority 

		//Thread.currentThread().setPriority(15);
		
		Thread.currentThread().setPriority(7);   //setting current 
		
		/*myThreads t=new myThreads(); 
		
		System.out.println(t.getPriority());*/
		
		System.out.println(Thread.currentThread().getPriority());

	}

}
