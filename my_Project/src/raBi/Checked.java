package raBi;
import java.io.*;
public class Checked 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		@SuppressWarnings("resource")
		PrintWriter p=new PrintWriter("abc.text");
		p.println("hello");
		System.out.println(10/0);
	}

}


//if i will not put filnotfound then it will not show arthematic exception