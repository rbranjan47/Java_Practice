package raBi;

public class String_Stringbuffer 
{

	public static void main(String[] args) 
	{
		String s1=new String("Rabi");
		String s2=new String("Rabi");
		
		System.out.println(s1==s2);  //reference comparison
		System.out.println(s1.equals(s2));   //content comparison
		
		StringBuffer s3=new StringBuffer("Rabi");
		StringBuffer s4=new StringBuffer("Rabi");
		
		System.out.println(s3==s4);   //reference comparison
		System.out.println(s3.equals(s4));    //reference comparison
		
		byte[] b= {100,101,102,103,104}; //it will return ALPHABET a/c to ASCII value given
		String s=new String(b);
		System.out.println(s);
		
		byte[] bytes="rabi ranjan".getBytes();
		String str=new String(bytes);
		System.out.println(str);
		
		//concatination
		String st="rabi";
		
		st=st.concat(" ranjan");
		//st=st+" kumar";
		//st+=" kumar";
		st=st.substring(1, 3);
		System.out.println(st);
		
		st=st.substring(0);
		System.out.println(st);
		
		System.out.println(st.length());
		
		String stri=st.toLowerCase();
		System.out.println(stri);
		
		String strin=st.toUpperCase();
		System.out.println(strin);

	}

}
