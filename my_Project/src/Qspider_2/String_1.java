package Qspider_2;

public class String_1 {

	public static void main(String[] args) 
	{
		String s1="java is easy";
		
		s1=s1.toUpperCase();
		//now garbage collector will call
	
		//length
		System.out.println(s1.length());
		
		//index at particular index
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(s1.length()-1));
		
		//index of particular index
		System.out.println(s1.indexOf('A'));
		
		//last index
		System.out.println(s1.lastIndexOf('A'));
	
		System.out.println(s1);
		
		
	}
}
