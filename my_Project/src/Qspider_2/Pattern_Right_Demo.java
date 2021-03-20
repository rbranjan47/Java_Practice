package Qspider_2;


public class Pattern_Right_Demo 
{

	public static void main(String[] args)
	{
		int num=5;
		for(int i=0;i<=num;i++)
		{
			for (int j=2*(num-i);j>0;j--)
			{
				System.out.print(" ");
			}
			for (int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
