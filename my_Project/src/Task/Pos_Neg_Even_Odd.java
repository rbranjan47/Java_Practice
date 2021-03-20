package Task;
/* Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s. */
import java.util.Scanner;

public class Pos_Neg_Even_Odd 
{
    //even count
	static int Eve (int arr[] )
	{
		int evencount=0;
		for (int i=0;i<20;i++)
		{
			if (arr[i]%2==0)
				evencount++;
		}
		return evencount;
	}
	//odd count
	static int odd (int arr[] )
	{
		int oddcount=0;
		for (int i=0;i<20;i++)
		{
			if (arr[i]%2!=0)
				oddcount++;
		}
		return oddcount;
	}
	//positive count
	static int  pos(int arr[] )
	{
		int poscount=0;
		for (int i=0;i<20;i++)
		{
			if (arr[i]>0)
				poscount++;
		}
		return poscount;
	}
	//negative count
	static int neg (int arr[] )
	{
		int negcount=0;
		for (int i=0;i<20;i++)
		{
			if (arr[i]<0)
				negcount++;
		}
		return negcount;
	}
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 20 arrray's element: ");
		
		int array[]=new int[20];
		for(int i=0;i<20;i++)
		{
			array[i]=sc.nextInt();
		}
		
		int evennum=Eve(array);
		System.out.println("even numbers are "+evennum);
		
		int oddnum=odd(array);
	    System.out.println("odd numbers are "+oddnum);
	    
	    int posnum=pos(array);
	    System.out.println("positive numbers are "+posnum);
	    
	    int neggnum=neg(array);
	    System.out.println("negative numbers are "+neggnum);
		
	    sc.close();
	}

}
