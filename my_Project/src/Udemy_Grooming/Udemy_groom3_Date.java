package Udemy_Grooming;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Udemy_groom3_Date 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args)
	{
		//Creating object of Date class
		Date d =new Date();
		
		System.out.println(d.toLocaleString());
		System.out.println(d.toString());
		
		//Creating object of Simple date format class
	    SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/YY");
	    System.out.println(sdf1.format(d));
	    
	    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/YY");
	    System.out.println(sdf2.format(d));
	    
	    SimpleDateFormat sdf3 = new SimpleDateFormat("YY/MM/dd");
	    System.out.println(sdf3.format(d));
	    
	    SimpleDateFormat sdf4 = new SimpleDateFormat("MM/dd");
	    System.out.println(sdf4.format(d));
	    
	    SimpleDateFormat sdf5 = new SimpleDateFormat("M/d/YY");
	    System.out.println(sdf5.format(d));
	    
	    SimpleDateFormat sdf6 = new SimpleDateFormat("M/d/YYYY");
	    System.out.println(sdf6.format(d));
	    
	    SimpleDateFormat sdf7 = new SimpleDateFormat("M/d/YY");
	    System.out.println(sdf7.format(d));
	}
}
