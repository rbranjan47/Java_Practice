package Qspider_2;

//count how many UPPER CASE and lower case letter present
public class String_Count {

	public static void main(String[] args)
	{
		String s1="Java Concept with Programming";
		
		int uppcount=0;
		int lowcount=0;
		
		for (int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if (ch>='A' && ch<='Z')
			{
				uppcount++;
			}
			else if(ch>='a' && ch<='z')
			{
				lowcount++;
			}
		}
		System.out.println("number's of Upper Case letter are "+uppcount);
		
		System.out.println("number's of Lower Case letter are "+lowcount);
		

	}

}
