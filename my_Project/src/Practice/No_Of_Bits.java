package Practice;
import java.util.Scanner;
public class No_Of_Bits 
{

	public static int isBits(int n)
	{
		int count=0;
		while(n!=0)
		{
			int rem=n%2;
			if(rem==1)
				count++;
			n=n/2;
		}
		return count;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		
		int num=sc.nextInt();
		
		int result=isBits(num);
		System.out.println(result);
		
		sc.close();
	}

}
