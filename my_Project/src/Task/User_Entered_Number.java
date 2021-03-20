package Task;

import java.util.Scanner;
/*Take 10 integer inputs from user and store them in an array.
 *  Again ask user to give a number. Now, tell user whether that number is present in array or not. */

public class User_Entered_Number 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 10 arrray's element: ");
		
		int array[]=new int[10];
		for(int i=0;i<10;i++)
		{
			array[i]=sc.nextInt();
		}
		
		System.out.println("enter any random number to check it is present in array's or not ");
		int num=sc.nextInt();
		
		
		for (int i=0;i<10;i++)
		{
			if (array[i]==num)
			{
				System.out.println("yes it got matched and it is present on index "+ i);
				break;
			}
			else if (array[i]!=num)
			{
				System.out.println("not matched ");
			}
		}

		
		sc.close();
	}

}
