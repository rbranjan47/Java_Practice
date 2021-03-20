package Task;

public class Frequency_Count {

	public static void main(String[] args) 
	{
		int ar[]= {4,5,-6,6,7,8,4,5,6,7,8,-9,-11,-9};
		
		int n=ar.length;
		//for (int i=0;i<ar.length;i++)
		for (int i=0;i<n;i++)
		{
			//if (ar[i]>=-12)
			//{
			int count=1;
			for (int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
					//ar[j]=-20;
					ar[j]=ar[n-1];
					j--;
					n--;
				}
			}
			System.out.println(ar[i]+"->"+count+" times");
		}
		//}

	}

}
