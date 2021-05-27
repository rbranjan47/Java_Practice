package Udemy_Grooming;

public class Udemy_groom1 
{
	private static int a = 20;
	public String getData()
	{
		String data = "This is method data";
		System.out.println(a);
		return data;
	}
	
	public static void main(String[] args)
	{
		Udemy_groom1 udemy = new Udemy_groom1();
		String required_text = udemy.getData();
		System.out.println(required_text);
		int a = 10;
		System.out.println(a);
		
		String text = "hello";
		System.out.println(text.charAt(2));
		System.out.println(text.indexOf('o'));
		
		String yahoo = "madam";
		String reverse = "";
		int count = yahoo.length();
		for (int i=count-1;i>=0;i--)
		{
			System.out.print(yahoo.charAt(i));
			reverse = reverse + yahoo.charAt(i);
			if (yahoo.equalsIgnoreCase(reverse))
			{
				
				System.out.println("matched");
			}
			else
			{
				System.out.println("not matched");
			}
		}
		
		
	}
}
