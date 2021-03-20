package raBi;

public class Sleep_Method {

	public static void main(String[] args) throws InterruptedException
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("we are using sleep method");
			Thread.sleep(2000);
			System.out.println("index"+i);
			
		}

	}

}
