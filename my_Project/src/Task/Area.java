package Task;

import java.util.Scanner;

public class Area 
{
	public double aOfCircle(int r)
	{
	double a=3.14*r*r;
	return a;
	}
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the radius");
		int n=sc.nextInt();
		Area a=new Area();
		double area=a.aOfCircle(n);
		System.out.println("Radius of circle "+n);
		System.out.println("Area of circle is "+area);
		
		sc.close();
	}
}
