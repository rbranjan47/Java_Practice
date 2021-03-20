//Here, we are printing just number of bits means,
//After converting the user number into binary number it will check for how many times '1' is present.

package Practice;
import java.util.Scanner;
public class No_Of_Bits_Demo 
{
	public static int intoBits(int n)
	{
		int count=0;
		while (n!=0)
		{
			int rem=n%2;
			if (rem==1)
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
		
		int result=intoBits(num);
		System.out.println("number of bits are "+result);
		sc.close();
	}

}
