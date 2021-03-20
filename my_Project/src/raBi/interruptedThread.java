package raBi;


class threadinterruption extends Thread
{
	public void run()
	{
		try
		{
			for (int i=0;i<10;i++)
			{
				System.out.println("i am lazy thread");
				Thread.sleep(2000);
			}
		}
		catch (InterruptedException e)
		{
			System.out.println("i got interrupted");
		}
    }
}

 public class interruptedThread
{
	public  static void main (String[] args) 
	{
		threadinterruption i=new threadinterruption();
		i.start();
		//i.interrupt();
	    System.out.println("end of main Thread after interruption");
	}

}
