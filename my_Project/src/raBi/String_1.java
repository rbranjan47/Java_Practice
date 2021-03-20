package raBi;

public class String_1 {

	public static void main(String[] args) 
	{
		String s=new String("rabi");
		String s2=s.toUpperCase();
		String s3=s.toLowerCase();
		String s4=s2.toLowerCase();
		
		System.out.println(s3.equals(s));
		System.out.println(s2.equals(s));
		System.out.println(s==s2);  // every false condition indicates a new object created 
		System.out.println(s==s3);
		System.out.println(s==s4);  //On content creation a new object is created in heap

	}

}
