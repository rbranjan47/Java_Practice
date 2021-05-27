package Udemy_Grooming;

public class udemy_groom2 
{
	public static void main(String[] args) 
	{
		int k = 1;
		for (int i = 0; i < 4; i++) 
		{
			// nested loops
			for (int j = 1; j <= 4 - i; j++) 
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}
		System.out.println("---------------------------");
		
		int m=10;
		for (int p=0; p<4;p++)
		{
			//nested loops
			for (int q=1; q<=4-p;q++)
			{
				System.out.print(m);
				System.out.print("\t");
				m--;
		    }
			System.out.println("");
		}
		System.out.println("---------------------------");
		
		int n=1;
		for (int a=0; a<4;a++)
		{
			//nested loops
			for (int b=1;b<=a+1;b++)
			{
				System.out.print(n);
				System.out.print("\t");
				n++;
			}
			System.out.println("");
		}
		System.out.println("---------------------------");
		
		for (int c=0; c<4;c++)
		{
			//nested loops
			for (int b=1;b<=c+1;b++)
			{
				System.out.print(b);
				System.out.print("\t");
				
			}
			System.out.println("");
		}
		System.out.println("---------------------------");
		
	}
}
