package Qspider_2;

public class Frequency_Count_2 
{

	public static void main(String[] args) 
	{
		int ar[]= {3,4,5,6,7,8,9,1,2,3,2,5,6,7,8,9,2,1,3,5,6,4};
		
		int big=ar[0];
		
		for (int i=1;i<ar.length;i++)
		{
			if(ar[i]>big)
				big=ar[i];
		}
		
		int count[]=new int [big+1];
		
		for (int i=0;i<ar.length;i++)
		{
			count[ar[i]]++;
		}

		for (int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
			System.out.println(i+"->"+count[i]);
		}
	}

}
