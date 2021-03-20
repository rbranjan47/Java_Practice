package Qspider_2;

public class String_Count_toCharArray {

	public static void main(String[] args)
	{
		String s="Rama and Laxmana";
		
		char ch[]=s.toCharArray();
		int uc=0;
		int lc=0;
		
		for (int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				uc++;
			}
			
			else if (ch[i]>='a' && ch[i]<='z')
			{
				lc++;
			}
		}
        System.out.println("number's of Upper Case letter are "+uc);
		
		System.out.println("number's of Lower Case letter are "+lc);
		

	}

}
