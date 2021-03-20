//we can interrupt a sleeping or waiting thread by using Interrupt method()

package raBi;

class myThread extends Thread
{
public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("lazy thread");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("getting interrupted/disturb");
		}
	}
}
	 public class Interrupt_Method 
	{
    public static void main(String[] args)
    {
     myThread t=new myThread();
     t.start();
     
     //now we are interrupting
     t.interrupt();
     System.out.println("end of main thread");
    }
	}
