package Qspider_2;

public class Avg_Array_method 
{
	 public static int[] sumOfEO (int ar[])
	     	{
		   int count[]={0,0};
		for(int i=0;i<ar.length;i++)	
		{
		  if(ar[i]%2==0)  
			count[0]++;
		    else
			count[1]++;
		}
		
	       	return count;
	      }

	  public static void main(String arg[])
	   {

	    int a[]={34,56,33,21,27,28,71};
	      int s[]=sumOfEO(a);
	      
	    System.out.println("Number of Even Number: "+s[0]);
	    System.out.println("Number of Odd Number: "+s[1]);

	   }


	}
