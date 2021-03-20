//0,0,7,6,14,12,21,18, 28
package Practice;

import java.util.Scanner;

public class Series_Demo1 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		int t1=7, t2=0, nextterm;
		
		for (int i=1;i<=num;i++)
		{
			nextterm=t1*t2;
			System.out.print(nextterm+" "+(nextterm-t2)+" ");
			t2++;
		}
		nextterm=t1*t2;
		System.out.println(nextterm);
		System.out.print("15th element of the series is = "+nextterm);
		
		sc.close();
	}

}
