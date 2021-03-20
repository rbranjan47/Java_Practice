package raBi;

public class Multi_threading  extends Thread
{

	public void run() 
	{
		for (int i=0;i<10;i++)
		{
			System.out.println("child thread");
		}
	}
	public static void main(String[] args) 
	{
		Multi_threading t=new Multi_threading();
		t.start();
		
		for (int i=0;i<10;i++)
		{
			System.out.println("parent thread");
		}

	}

}
