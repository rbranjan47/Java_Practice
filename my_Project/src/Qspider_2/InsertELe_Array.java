//insert a element to an array
package Qspider_2;

public class InsertELe_Array 
{
	public static int[]  insertArr(int ar[], int index,int element)
	{
		if (index<0 || index>ar.length)
		{
			System.out.println("not possible to insert");
			return ar;
		}
		int b[]=new int[ar.length+1];
		b[index]=element;
		
		for (int i=0;i<ar.length;i++)
		{
			if (i<index)
			{
				b[i]=ar[i];
			}
			else 
			{
				b[i+1]=ar[i];
			}
		}
		return b;
	}

	public static void main(String[] args) 
	{
		int a[]= {34,56,78,14,25};
		a=insertArr(a,2,39);

		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");
		}
	}

}
