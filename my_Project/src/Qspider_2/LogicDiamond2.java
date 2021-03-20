package Qspider_2;

public class LogicDiamond2 {

	public static void main(String[] args) 
	{
		int n=7;
		int st=1, sp=n/2;
		for (int i=1;i<=n;i++)
		{
		for (int j=1;j<=sp;j++)
		{
		System.out.print(" ");
		}
		int k=1;
		for (int j=1;j<=st;j++)
		{
		System.out.print(k+" ");
		if (j<=st/2)
		k++;
		else 
		k--;
		}
		if (i<=n/2)
		{
		st=st+2;
		sp--;
		}
		else 
		{
		st=st-2;
		sp++;
		}
		System.out.println();
		}

	}

}
