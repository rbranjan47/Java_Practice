package Qspider_2;

public class Half_Diamond_EvenOdd_i 
{

	public static void main(String[] args) 
	{
		int n=5;
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<n-i;j++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=2*i-1;j++)
			{
				if (i%2!=0)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
				}
			}
			System.out.println();
		}

	}

}
