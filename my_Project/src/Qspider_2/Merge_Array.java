package Qspider_2;

public class Merge_Array 
{
     static int[] mergeArray(int a[],int b[])
      {
    	  int c[]=new int[a.length+b.length];
    			  for (int i=0;i<a.length;i++)
    			  {
    				  c[i]=a[i];
    			  }
    	   for (int i=0;i<b.length;i++)
    	   {
    		   c[a.length+i]=b[i];//after 'a' array elements
    	   }
    	   return c;
      }
	public static void main(String[] args) 
	{
		int arr[]= {1,2,3,4,5,6,7};
		int brr[]= {2,4,6,8};
		
		int crr[]=mergeArray(arr,brr);
		
	for (int i=0;i<crr.length;i++)
	{
		System.out.print(crr[i]+" ");
	}
		
	}

}
