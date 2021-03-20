package Task;

public class Biggest3_method 
{

	public static void isBiggest (int n1, int n2, int n3)
	{
		if (n1>n2 && n1>n3)
		{
			System.out.println("bigger number is "+n1);
		}
		else if (n2>n1 && n2>n3)
		{
			System.out.println("bigger number is "+n2);
		}
		else 
			System.out.println("biggger number is "+n3);
	}
	public static void main(String[] args)
	{
		isBiggest(13,12,11);

	}

}
