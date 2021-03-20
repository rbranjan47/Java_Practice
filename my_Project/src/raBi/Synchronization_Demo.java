package raBi;


class Display   //creating display class 
{
	public synchronized void wish(String name)
	{
		for (int i=0;i<10;i++)
		{
			System.out.println("good morning");
			
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println("got interrupted");
			}
		}
		System.out.println(name);
	}
}

class thisThread extends Thread
{
	Display d;
	String name;
	
	thisThread(Display d, String name)
	{
		this.d=d;  //using THIS keyword for calling reference
		this.name=name;
	}
	
	public void run()
	{
		d.wish(name);  //calling display by using object reference
	}
}
public class Synchronization_Demo
{

	public static void main(String[] args) 
	{
		Display d=new Display();
		thisThread t1=new thisThread(d, "Dhoni");
		thisThread t2=new thisThread(d, "kohli");
		thisThread t3=new thisThread(d,"Raina");
		
		t1.start();
		t2.start();
		t3.start();

	}

}
