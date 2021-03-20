package Qspider_1;

import java.util.Scanner;

public class Maks_method 
{
	public static String  getResult(int m1, int m2, int m3, int m4)
	{
		if (m1<34 || m2<35 || m3<35 || m4<35)
			return "fail";
		
		double per=(m1+m2+m3+m4)/4.0;
		if (per>85.0)
			return "distinction";
		else if (per>60)
			return "first class";
		else if (per>40)
			return "second class";
		else 
			return "pass";
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the four subject marks");
		
		int mark1=sc.nextInt();
		int mark2=sc.nextInt();
		int mark3=sc.nextInt();
		int mark4=sc.nextInt();
		
		String result=getResult(mark1,mark2, mark3, mark4);
		
		System.out.println("result is: "+result);
		
		sc.close();
	}

}
