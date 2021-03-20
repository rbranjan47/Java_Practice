package Qspider_2;

public class avg_even_odd_ARRAY 
{
	public static void main(String[] args)
	{
		int array[]= {1,2,3,4,5,6,7,8,9};
		int evensum=0, oddsum=0, evencount=0, oddcount=0;
		
		for (int i=0;i<array.length;i++)
		{
			if (array[i]%2==0)
			{
				evencount++;
				evensum=evensum+array[i];
			}
			else
			{
				oddcount++;
				oddsum=oddsum+array[i];
			}
		}
		System.out.println("avergae of even elements is: "+evensum/evencount);
		System.out.println("average of odd elements is: "+oddsum/oddcount);

	}

}
