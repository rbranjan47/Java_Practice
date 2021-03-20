package Task;

public class Prime_number
{
	public static void main(String[] args) 
	{
		
		int number=0;
		String primenumber="";
		
		for (number=1;number<=100;number++)
		{
			int count=0;
			for  (int i=number;i>=1;i--)
			{
				if (number%i==0)
					count++;
			}
			if (count==2)
			{
				primenumber=primenumber+ number+" ";
			}
		}
		System.out.println("prime numbers are: ");
		System.out.println(primenumber);
	}

}
