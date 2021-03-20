package Qspider_2;

public class String_toChar {

	public static void main(String[] args)
	{
		String s="programming";
		
		char ch[]=s.toCharArray();
		
		System.out.print("{ ");
		for (int i=0;i<ch.length;i++)
		{
		System.out.print(i+"->"+ch[i]);
		}
		System.out.print("}");
	}

}
