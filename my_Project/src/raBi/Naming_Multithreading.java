package raBi;

public class Naming_Multithreading extends Thread
{

	public static void main(String[] args) 
	{
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
		Naming_Multithreading t=new Naming_Multithreading();
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		
		Thread.currentThread().setName("Rabi");
		
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
		Thread.currentThread().setPriority(MAX_PRIORITY);
		System.out.println(Thread.currentThread().getPriority());

	}

}
