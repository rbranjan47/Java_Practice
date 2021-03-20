package raBi;

public class Throws
{

	public static void main(String[] args)  throws InterruptedException
	{
		
		/*Thread.sleep(10000); */ // here checked exception
		
		/*try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
		}*/ //using try-catch we can handle our exception
		
		
		Thread.sleep(10000);
	}

}
