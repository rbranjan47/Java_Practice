package raBi;

public class thatthread extends Thread
{
	public void run()
	{
		for (int i=0;i<10;i++)
		{
			System.out.println("sita thread");
			
			try
			{
				Thread.sleep(2000);   // after every 2 sec sita thread compile
			}
			catch (InterruptedException e)
			{
				System.out.println("Sita");
			}
		}
	}
}

class DemoThread
{
	public static void main(String[] args) throws InterruptedException
	{
		thatthread t=new thatthread();
		t.start();
		t.join();   // there is no time wait by ram thread
		//t.join(10000);  // 10 sec will wait ram thread and then it start compiling
		for (int i=0;i<10;i++)
		{
			System.out.println("Rama Thread");
		}
	}
}