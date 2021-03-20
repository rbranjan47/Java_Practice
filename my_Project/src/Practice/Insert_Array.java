package Practice;

public class Insert_Array 
{
	public static int[] Insertarray(int arr[] , int index, int ele)
	{
		if (index<0 || index>arr.length)
		{
			System.out.println("not possible to add");
			return arr;
		}
		int b[]=new int[arr.length+1];
		b[index]=ele;
		for (int i=0;i<arr.length;i++)
		{
			if (i<index)
			{
				b[i]=arr[i];
			}
			else 
				b[i+1]=arr[i];
		}
		return b;
	}

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7,8,9};
		
		a=Insertarray(a,2,10);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
		

	}

}
