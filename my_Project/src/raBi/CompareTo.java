package raBi;

public class CompareTo 
{

	public static void main(String[] args) 
	{
		System.out.println("a".compareTo("A"));
		System.out.println("k".compareTo("B"));
		
		Integer i1=25;
		Integer i2=35;
		System.out.println(i1.compareTo(i2));
		
		Double d1=23.4;
		Double d2=13.5;
		System.out.println(d1.compareTo(d2));
		
		
		// we can also compare  string by wrapper object
		
		String s1="a";
		String s2="A";
		System.out.println(s1.compareTo(s2));//lexical comparison

	}

}
