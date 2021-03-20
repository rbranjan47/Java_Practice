package Task;

public class Special3_method 
{
	public static boolean isSpecial(int n)
	{
		int d1=n%10;
		int d2=n/100;
		int d3=(n-d2*100)%10;
		
		int sum=(d1+d2+d3)+(d1*d2*d3);
		
		return (sum==n);
	}
	public static void main(String[] args) 
	{
		boolean sp=isSpecial(111);
		if (sp==true)
		    System.out.println("special number");
		else
			System.out.println("not a special number");
	}

}
