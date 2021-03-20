package Qspider_2;

public class DeleteEle_Array 
{
	public static int[]  deleteArr(int ar[], int index)
	{
		if (index<0 || index>ar.length)
		{
			System.out.println("not possible to delete");
			return ar;  //not possible returning same array
		}
		int b[]=new int[ar.length-1];
		
		for (int i=0;i<ar.length-1;i++)
		{
			if (i<index)
			{
				b[i]=ar[i];
			}
			else 
			{
				b[i]=ar[i+1];
			}
		}
		return b;
	}

	public static void main(String[] args) 
	{
		int a[]= {11,22,33,44,55,66,77,88};
		a=deleteArr(a,2);  //here we have to delete the element having index 2 i.e. 33

		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
